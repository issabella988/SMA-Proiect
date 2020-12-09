package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.virtualwaiter.Order_Type

class Seafood : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seafood)
        total_cal()
        orders_list_init()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        setContentView(R.layout.activity_order__type)
    }

    fun dec(x: Int): Int {
        var x = x
        return if (x > 0) {
            x--
            x
        } else 0
    }

    fun inc(x: Int): Int {
        var x = x
        x++
        return x
    }

    fun bourbon_glazed_salmon_inc(view: View?) {
        bourbon_glazed_salmon = inc(bourbon_glazed_salmon)
        val tv = findViewById<View>(R.id.bourbon_glazed_salmon_amount) as TextView
        tv.text = "" + bourbon_glazed_salmon
        total_cal()
    }

    fun bourbon_glazed_salmon_dec(view: View?) {
        if (bourbon_glazed_salmon >= 0) {
            bourbon_glazed_salmon = dec(bourbon_glazed_salmon)
            val tv = findViewById<View>(R.id.bourbon_glazed_salmon_amount) as TextView
            if (bourbon_glazed_salmon > 0) tv.text = "" + bourbon_glazed_salmon else tv.text = "0"
            total_cal()
        }
    }

    fun salmon_croquettes_inc(view: View?) {
        salmon_croquettes = inc(salmon_croquettes)
        val tv = findViewById<View>(R.id.salmon_croquettes_amount) as TextView
        tv.text = "" + salmon_croquettes
        total_cal()
    }

    fun salmon_croquettes_dec(view: View?) {
        if (salmon_croquettes >= 0) {
            salmon_croquettes = dec(salmon_croquettes)
            val tv = findViewById<View>(R.id.salmon_croquettes_amount) as TextView
            if (salmon_croquettes > 0) tv.text = "" + salmon_croquettes else tv.text = "0"
            total_cal()
        }
    }

    fun mussels_tomato_wine_broth_inc(view: View?) {
        mussels_tomato_wine_broth = inc(mussels_tomato_wine_broth)
        val tv = findViewById<View>(R.id.mussels_tomato_wine_broth_amount) as TextView
        tv.text = "" + mussels_tomato_wine_broth
        total_cal()
    }

    fun mussels_tomato_wine_broth_dec(view: View?) {
        if (mussels_tomato_wine_broth >= 0) {
            mussels_tomato_wine_broth = dec(mussels_tomato_wine_broth)
            val tv = findViewById<View>(R.id.mussels_tomato_wine_broth_amount) as TextView
            if (mussels_tomato_wine_broth > 0) tv.text = "" + mussels_tomato_wine_broth else tv.text = "0"
            total_cal()
        }
    }

    fun pan_fried_trout_inc(view: View?) {
        pan_fried_trout = inc(pan_fried_trout)
        val tv = findViewById<View>(R.id.pan_fried_trout_amount) as TextView
        tv.text = "" + pan_fried_trout
        total_cal()
    }

    fun pan_fried_trout_dec(view: View?) {
        if (pan_fried_trout >= 0) {
            pan_fried_trout = dec(pan_fried_trout)
            val tv = findViewById<View>(R.id.pan_fried_trout_amount) as TextView
            if (pan_fried_trout > 0) tv.text = "" + pan_fried_trout else tv.text = "0"
            total_cal()
        }
    }

    fun shrimp_stuffed_shells_inc(view: View?) {
        shrimp_stuffed_shells = inc(shrimp_stuffed_shells)
        val tv = findViewById<View>(R.id.shrimp_stuffed_shells_amount) as TextView
        tv.text = "" + shrimp_stuffed_shells
        total_cal()
    }

    fun shrimp_stuffed_shells_dec(view: View?) {
        if (shrimp_stuffed_shells >= 0) {
            shrimp_stuffed_shells = dec(shrimp_stuffed_shells)
            val tv = findViewById<View>(R.id.shrimp_stuffed_shells_amount) as TextView
            if (shrimp_stuffed_shells > 0) tv.text = "" + shrimp_stuffed_shells else tv.text = "0"
            total_cal()
        }
    }

    fun paella_inc(view: View?) {
        paella = inc(paella)
        val tv = findViewById<View>(R.id.paella_amount) as TextView
        tv.text = "" + paella
        total_cal()
    }

    fun paella_dec(view: View?) {
        if (paella >= 0) {
            paella = dec(paella)
            val tv = findViewById<View>(R.id.paella_amount) as TextView
            if (paella > 0) tv.text = "" + paella else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        seafood_total = bourbon_glazed_salmon * 12 + salmon_croquettes * 10 + mussels_tomato_wine_broth * 14 + pan_fried_trout * 10 + shrimp_stuffed_shells * 15 + paella * 14
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
        val tv = findViewById<View>(R.id.sume_so_far) as TextView
        tv.text = "$" + finalize_order.all_total
        orders_list_init()
    }

    fun main_menu(view: View?) {
        val goto_main_menu = Intent(this, Order_Type::class.java)
        startActivity(goto_main_menu)
        overridePendingTransition(R.anim.fadin, R.anim.fadout)
    }

    fun orders_list_init() {
        if (bourbon_glazed_salmon > 0) {
            val tv = findViewById<View>(R.id.bourbon_glazed_salmon_amount) as TextView
            tv.text = "" + bourbon_glazed_salmon
        }
        if (salmon_croquettes > 0) {
            val tv = findViewById<View>(R.id.salmon_croquettes_amount) as TextView
            tv.text = "" + salmon_croquettes
        }
        if (mussels_tomato_wine_broth > 0) {
            val tv = findViewById<View>(R.id.mussels_tomato_wine_broth_amount) as TextView
            tv.text = "" + mussels_tomato_wine_broth
        }
        if (pan_fried_trout > 0) {
            val tv = findViewById<View>(R.id.pan_fried_trout_amount) as TextView
            tv.text = "" + pan_fried_trout
        }
        if (shrimp_stuffed_shells > 0) {
            val tv = findViewById<View>(R.id.shrimp_stuffed_shells_amount) as TextView
            tv.text = "" + shrimp_stuffed_shells
        }
        if (paella > 0) {
            val tv = findViewById<View>(R.id.paella_amount) as TextView
            tv.text = "" + paella
        }
    }

    companion object {
        var bourbon_glazed_salmon = 0
        var salmon_croquettes = 0
        var mussels_tomato_wine_broth = 0
        var pan_fried_trout = 0
        var shrimp_stuffed_shells = 0
        var paella = 0
        @JvmField
        var seafood_total = 0
    }
}