package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.virtualwaiter.Order_Type

class Salads : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salads)
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

    fun watermelon_olive_feta_salad_inc(view: View?) {
        watermelon_olive_feta_salad = inc(watermelon_olive_feta_salad)
        val tv = findViewById<View>(R.id.watermelon_olive_feta_salad_amount) as TextView
        tv.text = "" + watermelon_olive_feta_salad
        total_cal()
    }

    fun watermelon_olive_feta_salad_dec(view: View?) {
        if (watermelon_olive_feta_salad >= 0) {
            watermelon_olive_feta_salad = dec(watermelon_olive_feta_salad)
            val tv = findViewById<View>(R.id.watermelon_olive_feta_salad_amount) as TextView
            if (watermelon_olive_feta_salad > 0) tv.text = "" + watermelon_olive_feta_salad else tv.text = "0"
            total_cal()
        }
    }

    fun carrot_salad_black_grape_dressing_inc(view: View?) {
        carrot_salad_black_grape_dressing = inc(carrot_salad_black_grape_dressing)
        val tv = findViewById<View>(R.id.carrot_salad_black_grape_dressing_amount) as TextView
        tv.text = "" + carrot_salad_black_grape_dressing
        total_cal()
    }

    fun carrot_salad_black_grape_dressing_dec(view: View?) {
        if (carrot_salad_black_grape_dressing >= 0) {
            carrot_salad_black_grape_dressing = dec(carrot_salad_black_grape_dressing)
            val tv = findViewById<View>(R.id.carrot_salad_black_grape_dressing_amount) as TextView
            if (carrot_salad_black_grape_dressing > 0) tv.text = "" + carrot_salad_black_grape_dressing else tv.text = "0"
            total_cal()
        }
    }

    fun bbq_potato_salad_inc(view: View?) {
        bbq_potato_salad = inc(bbq_potato_salad)
        val tv = findViewById<View>(R.id.bbq_potato_salad_amount) as TextView
        tv.text = "" + bbq_potato_salad
        total_cal()
    }

    fun bbq_potato_salad_dec(view: View?) {
        if (bbq_potato_salad >= 0) {
            bbq_potato_salad = dec(bbq_potato_salad)
            val tv = findViewById<View>(R.id.bbq_potato_salad_amount) as TextView
            if (bbq_potato_salad > 0) tv.text = "" + bbq_potato_salad else tv.text = "0"
            total_cal()
        }
    }

    fun asian_sesame_chicken_salad_inc(view: View?) {
        asian_sesame_chicken_salad = inc(asian_sesame_chicken_salad)
        val tv = findViewById<View>(R.id.asian_sesame_chicken_salad_amount) as TextView
        tv.text = "" + asian_sesame_chicken_salad
        total_cal()
    }

    fun asian_sesame_chicken_salad_dec(view: View?) {
        if (asian_sesame_chicken_salad >= 0) {
            asian_sesame_chicken_salad = dec(asian_sesame_chicken_salad)
            val tv = findViewById<View>(R.id.asian_sesame_chicken_salad_amount) as TextView
            if (asian_sesame_chicken_salad > 0) tv.text = "" + asian_sesame_chicken_salad else tv.text = "0"
            total_cal()
        }
    }

    fun caprese_salad_pesto_sauce_inc(view: View?) {
        caprese_salad_pesto_sauce = inc(caprese_salad_pesto_sauce)
        val tv = findViewById<View>(R.id.caprese_salad_pesto_sauce_amount) as TextView
        tv.text = "" + caprese_salad_pesto_sauce
        total_cal()
    }

    fun caprese_salad_pesto_sauce_dec(view: View?) {
        if (caprese_salad_pesto_sauce >= 0) {
            caprese_salad_pesto_sauce = dec(caprese_salad_pesto_sauce)
            val tv = findViewById<View>(R.id.caprese_salad_pesto_sauce_amount) as TextView
            if (caprese_salad_pesto_sauce > 0) tv.text = "" + caprese_salad_pesto_sauce else tv.text = "0"
            total_cal()
        }
    }

    fun caesar_salad_inc(view: View?) {
        caesar_salad = inc(caesar_salad)
        val tv = findViewById<View>(R.id.caesar_salad_amount) as TextView
        tv.text = "" + caesar_salad
        total_cal()
    }

    fun caesar_salad_dec(view: View?) {
        if (caesar_salad >= 0) {
            caesar_salad = dec(caesar_salad)
            val tv = findViewById<View>(R.id.caesar_salad_amount) as TextView
            if (caesar_salad > 0) tv.text = "" + caesar_salad else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        salads_total = watermelon_olive_feta_salad * 5 + carrot_salad_black_grape_dressing * 6 + bbq_potato_salad * 7 + asian_sesame_chicken_salad * 7 + caprese_salad_pesto_sauce * 8 + caesar_salad * 5
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (watermelon_olive_feta_salad > 0) {
            val tv = findViewById<View>(R.id.watermelon_olive_feta_salad_amount) as TextView
            tv.text = "" + watermelon_olive_feta_salad
        }
        if (carrot_salad_black_grape_dressing > 0) {
            val tv = findViewById<View>(R.id.carrot_salad_black_grape_dressing_amount) as TextView
            tv.text = "" + carrot_salad_black_grape_dressing
        }
        if (bbq_potato_salad > 0) {
            val tv = findViewById<View>(R.id.bbq_potato_salad_amount) as TextView
            tv.text = "" + bbq_potato_salad
        }
        if (asian_sesame_chicken_salad > 0) {
            val tv = findViewById<View>(R.id.asian_sesame_chicken_salad_amount) as TextView
            tv.text = "" + asian_sesame_chicken_salad
        }
        if (caprese_salad_pesto_sauce > 0) {
            val tv = findViewById<View>(R.id.caprese_salad_pesto_sauce_amount) as TextView
            tv.text = "" + caprese_salad_pesto_sauce
        }
        if (caesar_salad > 0) {
            val tv = findViewById<View>(R.id.caesar_salad_amount) as TextView
            tv.text = "" + caesar_salad
        }
    }

    companion object {
        @JvmField
        var watermelon_olive_feta_salad = 0
        @JvmField
        var carrot_salad_black_grape_dressing = 0
        @JvmField
        var bbq_potato_salad = 0
        @JvmField
        var asian_sesame_chicken_salad = 0
        @JvmField
        var caprese_salad_pesto_sauce = 0
        @JvmField
        var caesar_salad = 0
        @JvmField
        var salads_total = 0
    }
}