package com.example.virtualwaiter

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.virtualwaiter.R.id
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.stripe.android.ApiResultCallback
import com.stripe.android.PaymentIntentResult
import com.stripe.android.Stripe
import com.stripe.android.model.ConfirmPaymentIntentParams
import com.stripe.android.model.StripeIntent
import com.stripe.android.view.CardInputWidget
import okhttp3.*
import java.io.IOException
import java.lang.ref.WeakReference
import java.util.*
import kotlin.Throws

class CheckoutActivityJava : AppCompatActivity() {
    private val httpClient = OkHttpClient()
    private var paymentIntentClientSecret: String? = null
    private var stripe: Stripe? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_java)
        // Configure the SDK with your Stripe publishable key so it can make requests to Stripe
        stripe = Stripe(
                applicationContext,
                Objects.requireNonNull("pk_test_51H9Dq4CLeEG3TbrKbRRn3U9JkibAZYXHvwdHJ0cQ4xbRuVbvMZ6TIHcx4py3YT2GN9twpsYJZkSPv7uEVCojPOXT00wieFv1D2\n")
        )
        startCheckout()
    }

    private fun startCheckout() {
        // Create a PaymentIntent by calling the server's endpoint.
        val mediaType: MediaType = get.get("application/json; charset=utf-8")
        val json = ("{"
                + "\"currency\":\"usd\","
                + "\"items\":["
                + "{\"id\":\"photo_subscription\"}"
                + "]"
                + "}")
        val body: RequestBody = RequestBody.create(json, mediaType)
        val request = Request.Builder()
                .url(BACKEND_URL + "create-payment-intent")
                .post(body)
                .build()
        httpClient.newCall(request)
                .enqueue(PayCallback(this))
        // Hook up the pay button to the card widget and stripe instance
        val payButton = findViewById<Button>(id.payButton)
        payButton.setOnClickListener { view: View? ->
            val cardInputWidget = findViewById<CardInputWidget>(id.cardInputWidget)
            val params = cardInputWidget.paymentMethodCreateParams
            if (params != null) {
                val confirmParams = ConfirmPaymentIntentParams.createWithPaymentMethodCreateParams(params, paymentIntentClientSecret!!)
                stripe!!.confirmPayment(this, confirmParams)
            }
        }
    }

    private fun displayAlert(title: String,
                             message: String?) {
        val builder = AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
        builder.setPositiveButton("Ok", null)
        builder.create().show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Handle the result of stripe.confirmPayment
        stripeResult = stripe!!.onPaymentResult(requestCode, data, PaymentResultCallback(this))
    }

    @Throws(IOException::class)
    private fun onPaymentSuccess(response: Response) {
        val gson = Gson()
        val type = object : TypeToken<Map<String?, String?>?>() {}.type
        val responseMap = gson.fromJson<Map<String, String>>(
                Objects.requireNonNull(response.body).string(),
                type
        )
        paymentIntentClientSecret = responseMap["clientSecret"]
    }

    private class PayCallback internal constructor(activity: CheckoutActivityJava) : Callback {
        private val activityRef: WeakReference<CheckoutActivityJava>
        override fun onFailure(call: Call, e: IOException) {
            val activity = activityRef.get() ?: return
            activity.runOnUiThread {
                Toast.makeText(
                        activity, "Error: $e", Toast.LENGTH_LONG
                ).show()
            }
        }

        @Throws(IOException::class)
        override fun onResponse(call: Call, response: Response) {
            val activity = activityRef.get() ?: return
            if (!response.isSuccessful) {
                activity.runOnUiThread {
                    Toast.makeText(
                            activity, "Error: $response", Toast.LENGTH_LONG
                    ).show()
                }
            } else {
                activity.onPaymentSuccess(response)
            }
        }

        init {
            activityRef = WeakReference(activity)
        }
    }

    private class PaymentResultCallback internal constructor(activity: CheckoutActivityJava) : ApiResultCallback<PaymentIntentResult> {
        private val activityRef: WeakReference<CheckoutActivityJava>
        override fun onSuccess(result: PaymentIntentResult) {
            val activity = activityRef.get() ?: return
            val paymentIntent = result.intent
            val status = paymentIntent.status
            if (status == StripeIntent.Status.Succeeded) {
                // Payment completed successfully
                val gson = GsonBuilder().setPrettyPrinting().create()
                activity.displayAlert(
                        "Payment completed",
                        gson.toJson(paymentIntent)
                )
            } else if (status == StripeIntent.Status.RequiresPaymentMethod) {
                // Payment failed – allow retrying using a different payment method
                activity.displayAlert(
                        "Payment failed",
                        Objects.requireNonNull(paymentIntent.lastPaymentError).message
                )
            }
        }

        override fun onError(e: Exception) {
            val activity = activityRef.get() ?: return
            // Payment request failed – allow retrying using the same payment method
            activity.displayAlert("Error", e.toString())
        }

        init {
            activityRef = WeakReference(activity)
        }
    }

    companion object {
        private const val BACKEND_URL = "https://stripesa.herokuapp.com/"
        @JvmField
        var stripeResult = false
    }
}