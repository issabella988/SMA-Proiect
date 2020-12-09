package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Burgers : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burgers)
        total_cal()
        orders_list_init()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, Order_Type::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fadin, R.anim.fadout)
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

    fun crispy_burger_inc(view: View?) {
        crispy_burger = inc(crispy_burger)
        val tv = findViewById<View>(R.id.crispy_burger_amount) as TextView
        tv.text = "" + crispy_burger
        total_cal()
    }

    fun crispy_burger_dec(view: View?) {
        if (crispy_burger >= 0) {
            crispy_burger = dec(crispy_burger)
            val tv = findViewById<View>(R.id.crispy_burger_amount) as TextView
            if (crispy_burger > 0) tv.text = "" + crispy_burger else tv.text = "0"
            total_cal()
        }
    }

    fun classic_american_burger_inc(view: View?) {
        classic_american_burger = inc(classic_american_burger)
        val tv = findViewById<View>(R.id.classic_american_burger_amount) as TextView
        tv.text = "" + classic_american_burger
        total_cal()
    }

    fun classic_american_burger_dec(view: View?) {
        if (classic_american_burger >= 0) {
            classic_american_burger = dec(classic_american_burger)
            val tv = findViewById<View>(R.id.classic_american_burger_amount) as TextView
            if (classic_american_burger > 0) tv.text = "" + classic_american_burger else tv.text = "0"
            total_cal()
        }
    }

    fun golden_chicken_burger_inc(view: View?) {
        golden_chicken_burger = inc(golden_chicken_burger)
        val tv = findViewById<View>(R.id.golden_chicken_burger_amount) as TextView
        tv.text = "" + golden_chicken_burger
        total_cal()
    }

    fun golden_chicken_burger_dec(view: View?) {
        if (golden_chicken_burger >= 0) {
            golden_chicken_burger = dec(golden_chicken_burger)
            val tv = findViewById<View>(R.id.golden_chicken_burger_amount) as TextView
            if (golden_chicken_burger > 0) tv.text = "" + golden_chicken_burger else tv.text = "0"
            total_cal()
        }
    }

    fun red_spicy_burger_inc(view: View?) {
        red_spicy_burger = inc(red_spicy_burger)
        val tv = findViewById<View>(R.id.red_spicy_burger_amount) as TextView
        tv.text = "" + red_spicy_burger
        total_cal()
    }

    fun red_spicy_burger_dec(view: View?) {
        if (red_spicy_burger >= 0) {
            red_spicy_burger = dec(red_spicy_burger)
            val tv = findViewById<View>(R.id.red_spicy_burger_amount) as TextView
            if (red_spicy_burger > 0) tv.text = "" + red_spicy_burger else tv.text = "0"
            total_cal()
        }
    }

    fun veggie_burger_inc(view: View?) {
        veggie_burger = inc(veggie_burger)
        val tv = findViewById<View>(R.id.veggie_burger_amount) as TextView
        tv.text = "" + veggie_burger
        total_cal()
    }

    fun veggie_burger_dec(view: View?) {
        if (veggie_burger >= 0) {
            veggie_burger = dec(veggie_burger)
            val tv = findViewById<View>(R.id.veggie_burger_amount) as TextView
            if (veggie_burger > 0) tv.text = "" + veggie_burger else tv.text = "0"
            total_cal()
        }
    }

    fun halloumi_burger_inc(view: View?) {
        halloumi_burger = inc(halloumi_burger)
        val tv = findViewById<View>(R.id.halloumi_burger_amount) as TextView
        tv.text = "" + halloumi_burger
        total_cal()
    }

    fun halloumi_burger_dec(view: View?) {
        if (halloumi_burger >= 0) {
            halloumi_burger = dec(halloumi_burger)
            val tv = findViewById<View>(R.id.halloumi_burger_amount) as TextView
            if (halloumi_burger > 0) tv.text = "" + halloumi_burger else tv.text = "0"
            total_cal()
        }
    }

    fun chief_burger_inc(view: View?) {
        chief_burger = inc(chief_burger)
        val tv = findViewById<View>(R.id.chief_burger_amount) as TextView
        tv.text = "" + chief_burger
        total_cal()
    }

    fun chief_burger_dec(view: View?) {
        if (chief_burger >= 0) {
            chief_burger = dec(chief_burger)
            val tv = findViewById<View>(R.id.chief_burger_amount) as TextView
            if (chief_burger > 0) tv.text = "" + chief_burger else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        burgers_total = crispy_burger * 7 + classic_american_burger * 6 + golden_chicken_burger * 6 + red_spicy_burger * 8 + veggie_burger * 6 + halloumi_burger * 7 + chief_burger * 12
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (crispy_burger > 0) {
            val tv = findViewById<View>(R.id.crispy_burger_amount) as TextView
            tv.text = "" + crispy_burger
        }
        if (classic_american_burger > 0) {
            val tv = findViewById<View>(R.id.classic_american_burger_amount) as TextView
            tv.text = "" + classic_american_burger
        }
        if (golden_chicken_burger > 0) {
            val tv = findViewById<View>(R.id.golden_chicken_burger_amount) as TextView
            tv.text = "" + golden_chicken_burger
        }
        if (red_spicy_burger > 0) {
            val tv = findViewById<View>(R.id.red_spicy_burger_amount) as TextView
            tv.text = "" + red_spicy_burger
        }
        if (veggie_burger > 0) {
            val tv = findViewById<View>(R.id.veggie_burger_amount) as TextView
            tv.text = "" + veggie_burger
        }
        if (halloumi_burger > 0) {
            val tv = findViewById<View>(R.id.halloumi_burger_amount) as TextView
            tv.text = "" + halloumi_burger
        }
        if (chief_burger > 0) {
            val tv = findViewById<View>(R.id.chief_burger_amount) as TextView
            tv.text = "" + chief_burger
        }
    }

    companion object {
        @JvmField
        var crispy_burger = 0
        @JvmField
        var classic_american_burger = 0
        @JvmField
        var golden_chicken_burger = 0
        @JvmField
        var red_spicy_burger = 0
        @JvmField
        var veggie_burger = 0
        @JvmField
        var halloumi_burger = 0
        @JvmField
        var chief_burger = 0
        @JvmField
        var burgers_total = 0
    }
}