package com.example.virtualwaiter

import android.app.Activity
import android.os.Bundle
import com.example.virtualwaiter.R
import com.example.virtualwaiter.AlcoholicDrinks
import android.widget.TextView
import com.example.virtualwaiter.finalize_order
import com.example.virtualwaiter.Breakfast
import com.example.virtualwaiter.Appetizers
import com.example.virtualwaiter.Soup
import com.example.virtualwaiter.MainCourse
import com.example.virtualwaiter.Pizza
import com.example.virtualwaiter.Burgers
import com.example.virtualwaiter.Salads
import com.example.virtualwaiter.Seafood
import com.example.virtualwaiter.Desserts
import com.example.virtualwaiter.NonAlcoholicDrinks
import android.content.Intent
import android.view.View
import com.example.virtualwaiter.Order_Type

class AlcoholicDrinks : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alcoholic_drinks)
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

    fun escobar_inc(view: View?) {
        escobar = inc(escobar)
        val tv = findViewById<View>(R.id.escobar_amount) as TextView
        tv.text = "" + escobar
        total_cal()
    }

    fun escobar_dec(view: View?) {
        if (escobar >= 0) {
            escobar = dec(escobar)
            val tv = findViewById<View>(R.id.escobar_amount) as TextView
            if (escobar > 0) tv.text = "" + escobar else tv.text = "0"
            total_cal()
        }
    }

    fun stormtrooper_inc(view: View?) {
        stormtrooper = inc(stormtrooper)
        val tv = findViewById<View>(R.id.stormtrooper_amount) as TextView
        tv.text = "" + stormtrooper
        total_cal()
    }

    fun stormtrooper_dec(view: View?) {
        if (stormtrooper >= 0) {
            stormtrooper = dec(stormtrooper)
            val tv = findViewById<View>(R.id.stormtrooper_amount) as TextView
            if (stormtrooper > 0) tv.text = "" + stormtrooper else tv.text = "0"
            total_cal()
        }
    }

    fun easy_breezy_inc(view: View?) {
        easy_breezy = inc(easy_breezy)
        val tv = findViewById<View>(R.id.easy_breezy_amount) as TextView
        tv.text = "" + easy_breezy
        total_cal()
    }

    fun easy_breezy_dec(view: View?) {
        if (easy_breezy >= 0) {
            easy_breezy = dec(easy_breezy)
            val tv = findViewById<View>(R.id.easy_breezy_amount) as TextView
            if (easy_breezy > 0) tv.text = "" + easy_breezy else tv.text = "0"
            total_cal()
        }
    }

    fun the_drake_inc(view: View?) {
        the_drake = inc(the_drake)
        val tv = findViewById<View>(R.id.the_drake_amount) as TextView
        tv.text = "" + the_drake
        total_cal()
    }

    fun the_drake_dec(view: View?) {
        if (the_drake >= 0) {
            the_drake = dec(the_drake)
            val tv = findViewById<View>(R.id.the_drake_amount) as TextView
            if (the_drake > 0) tv.text = "" + the_drake else tv.text = "0"
            total_cal()
        }
    }

    fun budweiser_inc(view: View?) {
        budweiser = inc(budweiser)
        val tv = findViewById<View>(R.id.budweiser_amount) as TextView
        tv.text = "" + budweiser
        total_cal()
    }

    fun budweiser_dec(view: View?) {
        if (budweiser >= 0) {
            budweiser = dec(budweiser)
            val tv = findViewById<View>(R.id.budweiser_amount) as TextView
            if (budweiser > 0) tv.text = "" + budweiser else tv.text = "0"
            total_cal()
        }
    }

    fun bud_light_inc(view: View?) {
        bud_light = inc(bud_light)
        val tv = findViewById<View>(R.id.bud_light_amount) as TextView
        tv.text = "" + bud_light
        total_cal()
    }

    fun bud_light_dec(view: View?) {
        if (bud_light >= 0) {
            bud_light = dec(bud_light)
            val tv = findViewById<View>(R.id.bud_light_amount) as TextView
            if (bud_light > 0) tv.text = "" + bud_light else tv.text = "0"
            total_cal()
        }
    }

    fun heineken_inc(view: View?) {
        heineken = inc(heineken)
        val tv = findViewById<View>(R.id.heineken_amount) as TextView
        tv.text = "" + heineken
        total_cal()
    }

    fun heineken_dec(view: View?) {
        if (heineken >= 0) {
            heineken = dec(heineken)
            val tv = findViewById<View>(R.id.heineken_amount) as TextView
            if (heineken > 0) tv.text = "" + heineken else tv.text = "0"
            total_cal()
        }
    }

    fun corona_inc(view: View?) {
        corona = inc(corona)
        val tv = findViewById<View>(R.id.corona_amount) as TextView
        tv.text = "" + corona
        total_cal()
    }

    fun corona_dec(view: View?) {
        if (corona >= 0) {
            corona = dec(corona)
            val tv = findViewById<View>(R.id.corona_amount) as TextView
            if (corona > 0) tv.text = "" + corona else tv.text = "0"
            total_cal()
        }
    }

    fun augustiner_inc(view: View?) {
        augustiner = inc(augustiner)
        val tv = findViewById<View>(R.id.augustiner_amount) as TextView
        tv.text = "" + augustiner
        total_cal()
    }

    fun augustiner_dec(view: View?) {
        if (augustiner >= 0) {
            augustiner = dec(augustiner)
            val tv = findViewById<View>(R.id.augustiner_amount) as TextView
            if (augustiner > 0) tv.text = "" + augustiner else tv.text = "0"
            total_cal()
        }
    }

    fun cabernet_sauvignon_inc(view: View?) {
        cabernet_sauvignon = inc(cabernet_sauvignon)
        val tv = findViewById<View>(R.id.cabernet_sauvignon_amount) as TextView
        tv.text = "" + cabernet_sauvignon
        total_cal()
    }

    fun cabernet_sauvignon_dec(view: View?) {
        if (cabernet_sauvignon >= 0) {
            cabernet_sauvignon = dec(cabernet_sauvignon)
            val tv = findViewById<View>(R.id.cabernet_sauvignon_amount) as TextView
            if (cabernet_sauvignon > 0) tv.text = "" + cabernet_sauvignon else tv.text = "0"
            total_cal()
        }
    }

    fun chardonnay_inc(view: View?) {
        chardonnay = inc(chardonnay)
        val tv = findViewById<View>(R.id.chardonnay_amount) as TextView
        tv.text = "" + chardonnay
        total_cal()
    }

    fun chardonnay_dec(view: View?) {
        if (chardonnay >= 0) {
            chardonnay = dec(chardonnay)
            val tv = findViewById<View>(R.id.chardonnay_amount) as TextView
            if (chardonnay > 0) tv.text = "" + chardonnay else tv.text = "0"
            total_cal()
        }
    }

    fun pinot_gris_inc(view: View?) {
        pinot_gris = inc(pinot_gris)
        val tv = findViewById<View>(R.id.pinot_gris_amount) as TextView
        tv.text = "" + pinot_gris
        total_cal()
    }

    fun pinot_gris_dec(view: View?) {
        if (pinot_gris >= 0) {
            pinot_gris = dec(pinot_gris)
            val tv = findViewById<View>(R.id.pinot_gris_amount) as TextView
            if (pinot_gris > 0) tv.text = "" + pinot_gris else tv.text = "0"
            total_cal()
        }
    }

    fun pinot_noir_inc(view: View?) {
        pinot_noir = inc(pinot_noir)
        val tv = findViewById<View>(R.id.pinot_noir_amount) as TextView
        tv.text = "" + pinot_noir
        total_cal()
    }

    fun pinot_noir_dec(view: View?) {
        if (pinot_noir >= 0) {
            pinot_noir = dec(pinot_noir)
            val tv = findViewById<View>(R.id.pinot_noir_amount) as TextView
            if (pinot_noir > 0) tv.text = "" + pinot_noir else tv.text = "0"
            total_cal()
        }
    }

    fun sauvignon_blanc_inc(view: View?) {
        sauvignon_blanc = inc(sauvignon_blanc)
        val tv = findViewById<View>(R.id.sauvignon_blanc_amount) as TextView
        tv.text = "" + sauvignon_blanc
        total_cal()
    }

    fun sauvignon_blanc_dec(view: View?) {
        if (sauvignon_blanc >= 0) {
            sauvignon_blanc = dec(sauvignon_blanc)
            val tv = findViewById<View>(R.id.sauvignon_blanc_amount) as TextView
            if (sauvignon_blanc > 0) tv.text = "" + sauvignon_blanc else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        alcoholic_drinks_total = escobar * 7 + stormtrooper * 7 + easy_breezy * 8 + the_drake * 8 + budweiser * 3 + bud_light * 3 + heineken * 3 + corona * 4 + augustiner * 5 + cabernet_sauvignon * 23 + chardonnay * 24 + pinot_gris * 27 + pinot_noir * 27 + sauvignon_blanc * 28
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + alcoholic_drinks_total
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
        if (escobar > 0) {
            val tv = findViewById<View>(R.id.escobar_amount) as TextView
            tv.text = "" + escobar
        }
        if (stormtrooper > 0) {
            val tv = findViewById<View>(R.id.stormtrooper_amount) as TextView
            tv.text = "" + stormtrooper
        }
        if (easy_breezy > 0) {
            val tv = findViewById<View>(R.id.easy_breezy_amount) as TextView
            tv.text = "" + easy_breezy
        }
        if (the_drake > 0) {
            val tv = findViewById<View>(R.id.the_drake_amount) as TextView
            tv.text = "" + the_drake
        }
        if (budweiser > 0) {
            val tv = findViewById<View>(R.id.budweiser_amount) as TextView
            tv.text = "" + budweiser
        }
        if (bud_light > 0) {
            val tv = findViewById<View>(R.id.bud_light_amount) as TextView
            tv.text = "" + bud_light
        }
        if (heineken > 0) {
            val tv = findViewById<View>(R.id.heineken_amount) as TextView
            tv.text = "" + heineken
        }
        if (corona > 0) {
            val tv = findViewById<View>(R.id.corona_amount) as TextView
            tv.text = "" + corona
        }
        if (augustiner > 0) {
            val tv = findViewById<View>(R.id.augustiner_amount) as TextView
            tv.text = "" + augustiner
        }
        if (cabernet_sauvignon > 0) {
            val tv = findViewById<View>(R.id.cabernet_sauvignon_amount) as TextView
            tv.text = "" + cabernet_sauvignon
        }
        if (chardonnay > 0) {
            val tv = findViewById<View>(R.id.chardonnay_amount) as TextView
            tv.text = "" + chardonnay
        }
        if (pinot_noir > 0) {
            val tv = findViewById<View>(R.id.pinot_noir_amount) as TextView
            tv.text = "" + pinot_noir
        }
        if (pinot_gris > 0) {
            val tv = findViewById<View>(R.id.pinot_gris_amount) as TextView
            tv.text = "" + pinot_gris
        }
        if (sauvignon_blanc > 0) {
            val tv = findViewById<View>(R.id.sauvignon_blanc_amount) as TextView
            tv.text = "" + sauvignon_blanc
        }
    }

    companion object {
        var escobar = 0
        var stormtrooper = 0
        var easy_breezy = 0
        var the_drake = 0
        var budweiser = 0
        var bud_light = 0
        var heineken = 0
        var corona = 0
        var augustiner = 0
        var cabernet_sauvignon = 0
        var chardonnay = 0
        var pinot_gris = 0
        var pinot_noir = 0
        var sauvignon_blanc = 0
        @JvmField
        var alcoholic_drinks_total = 0
    }
}