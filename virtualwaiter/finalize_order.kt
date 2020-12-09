package com.example.virtualwaiter

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.android.volley.Cache
import com.android.volley.Network
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import com.android.volley.toolbox.StringRequest
import com.example.virtualwaiter.CheckoutActivityJava
import com.example.virtualwaiter.Order_Type
import com.example.virtualwaiter.finalize_order
import java.io.BufferedReader
import java.io.PrintWriter
import java.net.Socket
import java.util.*

class finalize_order : Activity() {
    var a = this
    var personal_preferances: String? = null
    var oo: Any? = null
    var fin_order_string = ""
    var S: String? = null
    override fun onBackPressed() {
        // do nothing.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalize_order)
        show_Order()
        tot_v()
        oo = this
    }

    fun show_Order() {
        if (Breakfast.scrambled_eggs > 0) {
            fin_order_string = """
                ${fin_order_string}Scrambled eggs -> ${java.lang.String.valueOf(Breakfast.scrambled_eggs)}
                
                
                """.trimIndent()
        }
        if (Breakfast.denver > 0) {
            fin_order_string = """
                ${fin_order_string}Denver omelet -> ${java.lang.String.valueOf(Breakfast.denver)}
                
                
                """.trimIndent()
        }
        if (Breakfast.sausage_omelet > 0) {
            fin_order_string = """
                ${fin_order_string}Sausage and cheese omelet -> ${java.lang.String.valueOf(Breakfast.sausage_omelet)}
                
                
                """.trimIndent()
        }
        if (Breakfast.denver > 0) {
            fin_order_string = """
                ${fin_order_string}Denver omelet -> ${java.lang.String.valueOf(Breakfast.denver)}
                
                
                """.trimIndent()
        }
        if (Breakfast.french_toast > 0) {
            fin_order_string = """
                ${fin_order_string}French Toast -> ${java.lang.String.valueOf(Breakfast.french_toast)}
                
                
                """.trimIndent()
        }
        if (Breakfast.chicken_quiche > 0) {
            fin_order_string = """
                ${fin_order_string}Chicken and Mushroom Quiche -> ${java.lang.String.valueOf(Breakfast.chicken_quiche)}
                
                
                """.trimIndent()
        }
        if (Breakfast.english_bf > 0) {
            fin_order_string = """
                ${fin_order_string}English breakfast -> ${java.lang.String.valueOf(Breakfast.english_bf)}
                
                
                """.trimIndent()
        }
        if (Appetizers.artichoke > 0) {
            fin_order_string = """
                ${fin_order_string}Artichoke and spinach dip -> ${java.lang.String.valueOf(Appetizers.artichoke)}
                
                
                """.trimIndent()
        }
        if (Appetizers.bruschetta > 0) {
            fin_order_string = """
                ${fin_order_string}Bruschetta -> ${java.lang.String.valueOf(Appetizers.bruschetta)}
                
                
                """.trimIndent()
        }
        if (Appetizers.stuffed_mushrooms > 0) {
            fin_order_string = """
                ${fin_order_string}Stuffed mushrooms -> ${java.lang.String.valueOf(Appetizers.stuffed_mushrooms)}
                
                
                """.trimIndent()
        }
        if (Appetizers.fried_calamari > 0) {
            fin_order_string = """
                ${fin_order_string}Fried calamari -> ${java.lang.String.valueOf(Appetizers.fried_calamari)}
                
                
                """.trimIndent()
        }
        if (Appetizers.artichoke > 0) {
            fin_order_string = """
                ${fin_order_string}Artichoke and spinach dip -> ${java.lang.String.valueOf(Appetizers.artichoke)}
                
                
                """.trimIndent()
        }
        if (Appetizers.four_cheese_garlic_bread > 0) {
            fin_order_string = """
                ${fin_order_string}Four cheese garlic bread -> ${java.lang.String.valueOf(Appetizers.four_cheese_garlic_bread)}
                
                
                """.trimIndent()
        }
        if (Appetizers.shrimp_scampi > 0) {
            fin_order_string = """
                ${fin_order_string}Shrimp scampi -> ${java.lang.String.valueOf(Appetizers.shrimp_scampi)}
                
                
                """.trimIndent()
        }
        if (Appetizers.french_fries > 0) {
            fin_order_string = """
                ${fin_order_string}French fries -> ${java.lang.String.valueOf(Appetizers.french_fries)}
                
                
                """.trimIndent()
        }
        if (Soup.chicken_noodle_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Chicken noodle soup -> ${java.lang.String.valueOf(Soup.chicken_noodle_soup)}
                
                
                """.trimIndent()
        }
        if (Soup.vegetable_bacon_risoni_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Vegetable, bacon and risoni soup -> ${java.lang.String.valueOf(Soup.vegetable_bacon_risoni_soup)}
                
                
                """.trimIndent()
        }
        if (Soup.cream_of_cauliflower_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Cream of cauliflower soup -> ${java.lang.String.valueOf(Soup.cream_of_cauliflower_soup)}
                
                
                """.trimIndent()
        }
        if (Soup.pumpkin_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Pumpkin soup -> ${java.lang.String.valueOf(Soup.pumpkin_soup)}
                
                
                """.trimIndent()
        }
        if (Soup.tomato_soup > 0) {
            fin_order_string = """
                ${fin_order_string}Tomato soup -> ${java.lang.String.valueOf(Soup.tomato_soup)}
                
                
                """.trimIndent()
        }
        val temp_order_view = fin_order_string + old_ord_string
        val tv = findViewById<View>(R.id.order_final) as TextView
        tv.text = "" + temp_order_view
    }

    fun main_menu(view: View?) {
        val goto_main_menu = Intent(this, Order_Type::class.java)
        startActivity(goto_main_menu)
        overridePendingTransition(R.anim.fadin, R.anim.fadout)
    }

    fun tot_v() {
        all_total = all_total + old_all_total
        val tv = findViewById<View>(R.id.tot_p) as TextView
        tv.text = "Total price: " + "lei " + all_total
    }

    fun payWithStripe(): Boolean {
        val intents = Intent(this@finalize_order, CheckoutActivityJava::class.java)
        startActivity(intents)
        return if (CheckoutActivityJava.stripeResult) {
            true
        } else false
    }

    abstract inner class SendMessage : AsyncTask<Void?, Void?, Void?>() {
        var bb: BufferedReader? = null
        var client: Socket? = null
        var printwriter: PrintWriter? = null
        protected  fun doInBackground(vararg params: Void): Void? {
            try {
                val requestQueue: RequestQueue
                val cache: Cache = DiskBasedCache(cacheDir, 1024 * 1024)
                val network: Network = BasicNetwork(HurlStack())
                requestQueue = RequestQueue(cache, network)
                requestQueue.start()
                val url = "https://public.wooph.dev/~catabava/virtualwaiter/receiveOrder.php"
                val postRequest: StringRequest = object : StringRequest(Method.POST, url,
                        Response.Listener { response -> // daca nu e eroare, se executa aceasta metoda ( se printeaza response )
                            println(response)
                        },
                        Response.ErrorListener { error -> // daca e eroare, se printeaza eroarea propriu-zisa
                            println(error.message)
                        }
                ) {
                    override fun getParams(): Map<String, String> {
                        val params: MutableMap<String, String> = HashMap()
                        params["idOrder"] = Integer.toString(VirtualWaiter.orderID)
                        params["idMasa"] = Integer.toString(SlimpleTextClientActivity.tablex)
                        params["orderDescription"] = fin_order_string
                        params["orderPref"] = personal_preferances!!
                        params["price"] = Integer.toString(all_total - old_all_total)
                        params["priceTotal"] = Integer.toString(all_total)
                        return params
                    }
                }
                requestQueue.add(postRequest)
            } catch (e: Exception) {
                println("___EROARE____" + e.message)
                e.printStackTrace()
            }
            return null
        }
    }

    fun send_ord(v: View?) {
        order_string = fin_order_string
        val Ed = findViewById<View>(R.id.personalp) as EditText
        personal_preferances = Ed.text.toString()
        val o = this
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Are you sure you want to confirm this order?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, id ->
                    if (payWithStripe()) {
                        messsage = "Order:" + SlimpleTextClientActivity.tablex + "|" + fin_order_string + "|" + Integer.toString(all_total) + "|" + personal_preferances
                   //     val sendMessageTask = SendMessage()
                     //   sendMessageTask.execute()
                    }
                }
                .setNegativeButton("No") { dialog, id -> dialog.cancel() }
        val alert = builder.create()
        alert.show()
    }

    companion object {
        var client: Socket? = null
        var printwriter: PrintWriter? = null
        var bb: BufferedReader? = null
        var messsage: String? = null
        var m1: String? = null
        var old_all_total = 0
        var all_total = 0
        var next_ord_flag = 0
        var order_string: String? = null
        var old_ord_string = ""
    }
}