package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Breakfast : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfast)
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

    fun scrambled_eggs_inc(view: View?) {
        scrambled_eggs = inc(scrambled_eggs)
        val tv = findViewById<View>(R.id.scrambled_eggs_amount) as TextView
        tv.text = "" + scrambled_eggs
        total_cal()
    }

    fun scrambled_eggs_dec(view: View?) {
        if (scrambled_eggs >= 0) {
            scrambled_eggs = dec(scrambled_eggs)
            val tv = findViewById<View>(R.id.scrambled_eggs_amount) as TextView
            if (scrambled_eggs > 0) tv.text = "" + scrambled_eggs else tv.text = "0"
            total_cal()
        }
    }

    fun denver_inc(view: View?) {
        denver = inc(denver)
        val tv = findViewById<View>(R.id.denver_amount) as TextView
        tv.text = "" + denver
        total_cal()
    }

    fun denver_dec(view: View?) {
        if (denver >= 0) {
            denver = dec(denver)
            val tv = findViewById<View>(R.id.denver_amount) as TextView
            if (denver > 0) tv.text = "" + denver else tv.text = "0"
            total_cal()
        }
    }

    fun sausage_omelet_inc(view: View?) {
        sausage_omelet = inc(sausage_omelet)
        val tv = findViewById<View>(R.id.sausage_omelet_amount) as TextView
        tv.text = "" + sausage_omelet
        total_cal()
    }

    fun sausage_omelet_dec(view: View?) {
        if (sausage_omelet >= 0) {
            sausage_omelet = dec(sausage_omelet)
            val tv = findViewById<View>(R.id.sausage_omelet_amount) as TextView
            if (sausage_omelet > 0) tv.text = "" + sausage_omelet else tv.text = "0"
            total_cal()
        }
    }

    fun frittata_inc(view: View?) {
        frittata = inc(frittata)
        val tv = findViewById<View>(R.id.frittata_amount) as TextView
        tv.text = "" + frittata
        total_cal()
    }

    fun frittata_dec(view: View?) {
        if (frittata >= 0) {
            frittata = dec(frittata)
            val tv = findViewById<View>(R.id.frittata_amount) as TextView
            if (frittata > 0) tv.text = "" + frittata else tv.text = "0"
            total_cal()
        }
    }

    fun french_toast_inc(view: View?) {
        french_toast = inc(french_toast)
        val tv = findViewById<View>(R.id.french_toast_amount) as TextView
        tv.text = "" + french_toast
        total_cal()
    }

    fun french_toast_dec(view: View?) {
        if (french_toast >= 0) {
            french_toast = dec(french_toast)
            val tv = findViewById<View>(R.id.french_toast_amount) as TextView
            if (french_toast > 0) tv.text = "" + french_toast else tv.text = "0"
            total_cal()
        }
    }

    fun chicken_quiche_inc(view: View?) {
        chicken_quiche = inc(chicken_quiche)
        val tv = findViewById<View>(R.id.chicken_quiche_amount) as TextView
        tv.text = "" + chicken_quiche
        total_cal()
    }

    fun chicken_quiche_dec(view: View?) {
        if (chicken_quiche >= 0) {
            chicken_quiche = dec(chicken_quiche)
            val tv = findViewById<View>(R.id.chicken_quiche_amount) as TextView
            if (chicken_quiche > 0) tv.text = "" + chicken_quiche else tv.text = "0"
            total_cal()
        }
    }

    fun english_bf_inc(view: View?) {
        english_bf = inc(english_bf)
        val tv = findViewById<View>(R.id.english_bf_amount) as TextView
        tv.text = "" + english_bf
        total_cal()
    }

    fun english_bf_dec(view: View?) {
        if (english_bf >= 0) {
            english_bf = dec(english_bf)
            val tv = findViewById<View>(R.id.english_bf_amount) as TextView
            if (english_bf > 0) tv.text = "" + english_bf else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        breakfast_total = scrambled_eggs * 4 + denver * 3 + sausage_omelet * 4 + frittata * 5 + french_toast * 3 + chicken_quiche * 5 + english_bf * 6
        finalize_order.all_total = breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (scrambled_eggs > 0) {
            val tv = findViewById<View>(R.id.scrambled_eggs_amount) as TextView
            tv.text = "" + scrambled_eggs
        }
        if (denver > 0) {
            val tv = findViewById<View>(R.id.denver_amount) as TextView
            tv.text = "" + denver
        }
        if (sausage_omelet > 0) {
            val tv = findViewById<View>(R.id.sausage_omelet_amount) as TextView
            tv.text = "" + sausage_omelet
        }
        if (frittata > 0) {
            val tv = findViewById<View>(R.id.frittata_amount) as TextView
            tv.text = "" + frittata
        }
        if (french_toast > 0) {
            val tv = findViewById<View>(R.id.french_toast_amount) as TextView
            tv.text = "" + french_toast
        }
        if (chicken_quiche > 0) {
            val tv = findViewById<View>(R.id.chicken_quiche_amount) as TextView
            tv.text = "" + chicken_quiche
        }
        if (english_bf > 0) {
            val tv = findViewById<View>(R.id.english_bf_amount) as TextView
            tv.text = "" + english_bf
        }
    }

    companion object {
        @JvmField
        var scrambled_eggs = 0
        @JvmField
        var denver = 0
        @JvmField
        var sausage_omelet = 0
        @JvmField
        var frittata = 0
        @JvmField
        var french_toast = 0
        @JvmField
        var chicken_quiche = 0
        @JvmField
        var english_bf = 0
        @JvmField
        var breakfast_total = 0
    }
}