package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.virtualwaiter.Order_Type

class Soup : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soup)
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

    fun chicken_noodle_soup_inc(view: View?) {
        chicken_noodle_soup = inc(chicken_noodle_soup)
        val tv = findViewById<View>(R.id.chicken_noodle_soup_amount) as TextView
        tv.text = "" + chicken_noodle_soup
        total_cal()
    }

    fun chicken_noodle_soup_dec(view: View?) {
        if (chicken_noodle_soup >= 0) {
            chicken_noodle_soup = dec(chicken_noodle_soup)
            val tv = findViewById<View>(R.id.chicken_noodle_soup_amount) as TextView
            if (chicken_noodle_soup > 0) tv.text = "" + chicken_noodle_soup else tv.text = "0"
            total_cal()
        }
    }

    fun vegetable_bacon_risoni_soup_inc(view: View?) {
        vegetable_bacon_risoni_soup = inc(vegetable_bacon_risoni_soup)
        val tv = findViewById<View>(R.id.vegetable_bacon_risoni_soup_amount) as TextView
        tv.text = "" + vegetable_bacon_risoni_soup
        total_cal()
    }

    fun vegetable_bacon_risoni_soup_dec(view: View?) {
        if (vegetable_bacon_risoni_soup >= 0) {
            vegetable_bacon_risoni_soup = dec(vegetable_bacon_risoni_soup)
            val tv = findViewById<View>(R.id.vegetable_bacon_risoni_soup_amount) as TextView
            if (vegetable_bacon_risoni_soup > 0) tv.text = "" + vegetable_bacon_risoni_soup else tv.text = "0"
            total_cal()
        }
    }

    fun cream_of_cauliflower_soup_inc(view: View?) {
        cream_of_cauliflower_soup = inc(cream_of_cauliflower_soup)
        val tv = findViewById<View>(R.id.cream_of_cauliflower_amount) as TextView
        tv.text = "" + cream_of_cauliflower_soup
        total_cal()
    }

    fun cream_of_cauliflower_soup_dec(view: View?) {
        if (cream_of_cauliflower_soup >= 0) {
            cream_of_cauliflower_soup = dec(cream_of_cauliflower_soup)
            val tv = findViewById<View>(R.id.cream_of_cauliflower_amount) as TextView
            if (cream_of_cauliflower_soup > 0) tv.text = "" + cream_of_cauliflower_soup else tv.text = "0"
            total_cal()
        }
    }

    fun pumpkin_soup_inc(view: View?) {
        pumpkin_soup = inc(pumpkin_soup)
        val tv = findViewById<View>(R.id.pumpkin_soup_amount) as TextView
        tv.text = "" + pumpkin_soup
        total_cal()
    }

    fun pumpkin_soup_dec(view: View?) {
        if (pumpkin_soup >= 0) {
            pumpkin_soup = dec(pumpkin_soup)
            val tv = findViewById<View>(R.id.pumpkin_soup_amount) as TextView
            if (pumpkin_soup > 0) tv.text = "" + pumpkin_soup else tv.text = "0"
            total_cal()
        }
    }

    fun tomato_soup_inc(view: View?) {
        tomato_soup = inc(tomato_soup)
        val tv = findViewById<View>(R.id.tomato_soup_amount) as TextView
        tv.text = "" + tomato_soup
        total_cal()
    }

    fun tomato_soup_dec(view: View?) {
        if (tomato_soup >= 0) {
            tomato_soup = dec(tomato_soup)
            val tv = findViewById<View>(R.id.tomato_soup_amount) as TextView
            if (tomato_soup > 0) tv.text = "" + tomato_soup else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        soup_total = chicken_noodle_soup * 6 + vegetable_bacon_risoni_soup * 7 + cream_of_cauliflower_soup * 5 + pumpkin_soup * 5 + tomato_soup * 4
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (chicken_noodle_soup > 0) {
            val tv = findViewById<View>(R.id.chicken_noodle_soup_amount) as TextView
            tv.text = "" + chicken_noodle_soup
        }
        if (vegetable_bacon_risoni_soup > 0) {
            val tv = findViewById<View>(R.id.vegetable_bacon_risoni_soup_amount) as TextView
            tv.text = "" + vegetable_bacon_risoni_soup
        }
        if (cream_of_cauliflower_soup > 0) {
            val tv = findViewById<View>(R.id.cream_of_cauliflower_amount) as TextView
            tv.text = "" + cream_of_cauliflower_soup
        }
        if (pumpkin_soup > 0) {
            val tv = findViewById<View>(R.id.pumpkin_soup_amount) as TextView
            tv.text = "" + pumpkin_soup
        }
        if (tomato_soup > 0) {
            val tv = findViewById<View>(R.id.tomato_soup_amount) as TextView
            tv.text = "" + tomato_soup
        }
    }

    companion object {
        @JvmField
        var chicken_noodle_soup = 0
        @JvmField
        var vegetable_bacon_risoni_soup = 0
        @JvmField
        var cream_of_cauliflower_soup = 0
        @JvmField
        var pumpkin_soup = 0
        @JvmField
        var tomato_soup = 0
        @JvmField
        var soup_total = 0
    }
}