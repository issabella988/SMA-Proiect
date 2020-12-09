package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainCourse : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_course)
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

    fun mustard_stuffed_chicken_inc(view: View?) {
        mustard_stuffed_chicken = inc(mustard_stuffed_chicken)
        val tv = findViewById<View>(R.id.mustard_stuffed_chicken_amount) as TextView
        tv.text = "" + mustard_stuffed_chicken
        total_cal()
    }

    fun mustard_stuffed_chicken_dec(view: View?) {
        if (mustard_stuffed_chicken >= 0) {
            mustard_stuffed_chicken = dec(mustard_stuffed_chicken)
            val tv = findViewById<View>(R.id.mustard_stuffed_chicken_amount) as TextView
            if (mustard_stuffed_chicken > 0) tv.text = "" + mustard_stuffed_chicken else tv.text = "0"
            total_cal()
        }
    }

    fun parmesan_spring_chicken_inc(view: View?) {
        parmesan_spring_chicken = inc(parmesan_spring_chicken)
        val tv = findViewById<View>(R.id.parmesan_spring_chicken_amount) as TextView
        tv.text = "" + parmesan_spring_chicken
        total_cal()
    }

    fun parmesan_spring_chicken_dec(view: View?) {
        if (parmesan_spring_chicken >= 0) {
            parmesan_spring_chicken = dec(parmesan_spring_chicken)
            val tv = findViewById<View>(R.id.parmesan_spring_chicken_amount) as TextView
            if (parmesan_spring_chicken > 0) tv.text = "" + parmesan_spring_chicken else tv.text = "0"
            total_cal()
        }
    }

    fun slow_cooked_pulled_pork_inc(view: View?) {
        slow_cooked_pulled_pork = inc(slow_cooked_pulled_pork)
        val tv = findViewById<View>(R.id.slow_cooked_pulled_pork_amount) as TextView
        tv.text = "" + slow_cooked_pulled_pork
        total_cal()
    }

    fun slow_cooked_pulled_pork_dec(view: View?) {
        if (slow_cooked_pulled_pork >= 0) {
            slow_cooked_pulled_pork = dec(slow_cooked_pulled_pork)
            val tv = findViewById<View>(R.id.slow_cooked_pulled_pork_amount) as TextView
            if (slow_cooked_pulled_pork > 0) tv.text = "" + slow_cooked_pulled_pork else tv.text = "0"
            total_cal()
        }
    }

    fun lasagna_inc(view: View?) {
        lasagna = inc(lasagna)
        val tv = findViewById<View>(R.id.lasagna_amount) as TextView
        tv.text = "" + lasagna
        total_cal()
    }

    fun lasagna_dec(view: View?) {
        if (lasagna >= 0) {
            lasagna = dec(lasagna)
            val tv = findViewById<View>(R.id.lasagna_amount) as TextView
            if (lasagna > 0) tv.text = "" + lasagna else tv.text = "0"
            total_cal()
        }
    }

    fun grilled_salmon_inc(view: View?) {
        grilled_salmon = inc(grilled_salmon)
        val tv = findViewById<View>(R.id.grilled_salmon_amount) as TextView
        tv.text = "" + grilled_salmon
        total_cal()
    }

    fun grilled_salmon_dec(view: View?) {
        if (grilled_salmon >= 0) {
            grilled_salmon = dec(grilled_salmon)
            val tv = findViewById<View>(R.id.grilled_salmon_amount) as TextView
            if (grilled_salmon > 0) tv.text = "" + grilled_salmon else tv.text = "0"
            total_cal()
        }
    }

    fun mac_and_cheese_inc(view: View?) {
        mac_and_cheese = inc(mac_and_cheese)
        val tv = findViewById<View>(R.id.mac_and_cheese_amount) as TextView
        tv.text = "" + mac_and_cheese
        total_cal()
    }

    fun mac_and_cheese_dec(view: View?) {
        if (mac_and_cheese >= 0) {
            mac_and_cheese = dec(mac_and_cheese)
            val tv = findViewById<View>(R.id.mac_and_cheese_amount) as TextView
            if (mac_and_cheese > 0) tv.text = "" + mac_and_cheese else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        main_course_total = mustard_stuffed_chicken * 9 + parmesan_spring_chicken * 10 + slow_cooked_pulled_pork * 14 + lasagna * 13 + grilled_salmon * 15 + mac_and_cheese * 8
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (mustard_stuffed_chicken > 0) {
            val tv = findViewById<View>(R.id.mustard_stuffed_chicken_amount) as TextView
            tv.text = "" + mustard_stuffed_chicken
        }
        if (parmesan_spring_chicken > 0) {
            val tv = findViewById<View>(R.id.parmesan_spring_chicken_amount) as TextView
            tv.text = "" + parmesan_spring_chicken
        }
        if (slow_cooked_pulled_pork > 0) {
            val tv = findViewById<View>(R.id.slow_cooked_pulled_pork_amount) as TextView
            tv.text = "" + slow_cooked_pulled_pork
        }
        if (lasagna > 0) {
            val tv = findViewById<View>(R.id.lasagna_amount) as TextView
            tv.text = "" + lasagna
        }
        if (grilled_salmon > 0) {
            val tv = findViewById<View>(R.id.grilled_salmon_amount) as TextView
            tv.text = "" + grilled_salmon
        }
        if (mac_and_cheese > 0) {
            val tv = findViewById<View>(R.id.mac_and_cheese_amount) as TextView
            tv.text = "" + mac_and_cheese
        }
    }

    companion object {
        @JvmField
        var mustard_stuffed_chicken = 0
        @JvmField
        var parmesan_spring_chicken = 0
        @JvmField
        var slow_cooked_pulled_pork = 0
        @JvmField
        var lasagna = 0
        @JvmField
        var grilled_salmon = 0
        @JvmField
        var mac_and_cheese = 0
        @JvmField
        var main_course_total = 0
    }
}