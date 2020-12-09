package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class NonAlcoholicDrinks : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_alcoholic_drinks)
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

    fun still_water_inc(view: View?) {
        still_water = inc(still_water)
        val tv = findViewById<View>(R.id.still_water_amount) as TextView
        tv.text = "" + still_water
        total_cal()
    }

    fun still_water_dec(view: View?) {
        if (still_water >= 0) {
            still_water = dec(still_water)
            val tv = findViewById<View>(R.id.still_water_amount) as TextView
            if (still_water > 0) tv.text = "" + still_water else tv.text = "0"
            total_cal()
        }
    }

    fun sparkling_water_inc(view: View?) {
        sparkling_water = inc(sparkling_water)
        val tv = findViewById<View>(R.id.sparkling_water_amount) as TextView
        tv.text = "" + sparkling_water
        total_cal()
    }

    fun sparkling_water_dec(view: View?) {
        if (sparkling_water >= 0) {
            sparkling_water = dec(sparkling_water)
            val tv = findViewById<View>(R.id.sparkling_water_amount) as TextView
            if (sparkling_water > 0) tv.text = "" + sparkling_water else tv.text = "0"
            total_cal()
        }
    }

    fun coca_cola_inc(view: View?) {
        coca_cola = inc(coca_cola)
        val tv = findViewById<View>(R.id.coca_cola_amount) as TextView
        tv.text = "" + coca_cola
        total_cal()
    }

    fun coca_cola_dec(view: View?) {
        if (coca_cola >= 0) {
            coca_cola = dec(coca_cola)
            val tv = findViewById<View>(R.id.coca_cola_amount) as TextView
            if (coca_cola > 0) tv.text = "" + coca_cola else tv.text = "0"
            total_cal()
        }
    }

    fun diet_coke_inc(view: View?) {
        diet_coke = inc(diet_coke)
        val tv = findViewById<View>(R.id.diet_coke_amount) as TextView
        tv.text = "" + diet_coke
        total_cal()
    }

    fun diet_coke_dec(view: View?) {
        if (diet_coke >= 0) {
            diet_coke = dec(diet_coke)
            val tv = findViewById<View>(R.id.diet_coke_amount) as TextView
            if (diet_coke > 0) tv.text = "" + diet_coke else tv.text = "0"
            total_cal()
        }
    }

    fun dr_pepper_inc(view: View?) {
        dr_pepper = inc(dr_pepper)
        val tv = findViewById<View>(R.id.dr_pepper_amount) as TextView
        tv.text = "" + dr_pepper
        total_cal()
    }

    fun dr_pepper_dec(view: View?) {
        if (dr_pepper >= 0) {
            dr_pepper = dec(dr_pepper)
            val tv = findViewById<View>(R.id.dr_pepper_amount) as TextView
            if (dr_pepper > 0) tv.text = "" + dr_pepper else tv.text = "0"
            total_cal()
        }
    }

    fun sprite_inc(view: View?) {
        sprite = inc(sprite)
        val tv = findViewById<View>(R.id.sprite_amount) as TextView
        tv.text = "" + sprite
        total_cal()
    }

    fun sprite_dec(view: View?) {
        if (sprite >= 0) {
            sprite = dec(sprite)
            val tv = findViewById<View>(R.id.sprite_amount) as TextView
            if (sprite > 0) tv.text = "" + sprite else tv.text = "0"
            total_cal()
        }
    }

    fun fanta_inc(view: View?) {
        fanta = inc(fanta)
        val tv = findViewById<View>(R.id.fanta_amount) as TextView
        tv.text = "" + fanta
        total_cal()
    }

    fun fanta_dec(view: View?) {
        if (fanta >= 0) {
            fanta = dec(fanta)
            val tv = findViewById<View>(R.id.fanta_amount) as TextView
            if (fanta > 0) tv.text = "" + fanta else tv.text = "0"
            total_cal()
        }
    }

    fun coffee_inc(view: View?) {
        coffee = inc(coffee)
        val tv = findViewById<View>(R.id.coffee_amount) as TextView
        tv.text = "" + coffee
        total_cal()
    }

    fun coffee_dec(view: View?) {
        if (coffee >= 0) {
            coffee = dec(coffee)
            val tv = findViewById<View>(R.id.coffee_amount) as TextView
            if (coffee > 0) tv.text = "" + coffee else tv.text = "0"
            total_cal()
        }
    }

    fun latte_machiatto_inc(view: View?) {
        latte_machiatto = inc(latte_machiatto)
        val tv = findViewById<View>(R.id.latte_machiatto_amount) as TextView
        tv.text = "" + latte_machiatto
        total_cal()
    }

    fun latte_machiatto_dec(view: View?) {
        if (latte_machiatto >= 0) {
            latte_machiatto = dec(latte_machiatto)
            val tv = findViewById<View>(R.id.latte_machiatto_amount) as TextView
            if (latte_machiatto > 0) tv.text = "" + latte_machiatto else tv.text = "0"
            total_cal()
        }
    }

    fun tea_inc(view: View?) {
        tea = inc(tea)
        val tv = findViewById<View>(R.id.tea_amount) as TextView
        tv.text = "" + tea
        total_cal()
    }

    fun tea_dec(view: View?) {
        if (tea >= 0) {
            tea = dec(tea)
            val tv = findViewById<View>(R.id.tea_amount) as TextView
            if (tea > 0) tv.text = "" + tea else tv.text = "0"
            total_cal()
        }
    }

    fun chocolate_milkshake_inc(view: View?) {
        chocolate_milkshake = inc(chocolate_milkshake)
        val tv = findViewById<View>(R.id.chocolate_milkshake_amount) as TextView
        tv.text = "" + chocolate_milkshake
        total_cal()
    }

    fun chocolate_milkshake_dec(view: View?) {
        if (chocolate_milkshake >= 0) {
            chocolate_milkshake = dec(chocolate_milkshake)
            val tv = findViewById<View>(R.id.chocolate_milkshake_amount) as TextView
            if (chocolate_milkshake > 0) tv.text = "" + chocolate_milkshake else tv.text = "0"
            total_cal()
        }
    }

    fun fresh_orange_juice_inc(view: View?) {
        fresh_orange_juice = inc(fresh_orange_juice)
        val tv = findViewById<View>(R.id.fresh_orange_juice_amount) as TextView
        tv.text = "" + fresh_orange_juice
        total_cal()
    }

    fun fresh_orange_juice_dec(view: View?) {
        if (fresh_orange_juice >= 0) {
            fresh_orange_juice = dec(fresh_orange_juice)
            val tv = findViewById<View>(R.id.fresh_orange_juice_amount) as TextView
            if (fresh_orange_juice > 0) tv.text = "" + fresh_orange_juice else tv.text = "0"
            total_cal()
        }
    }

    fun peach_juice_inc(view: View?) {
        peach_juice = inc(peach_juice)
        val tv = findViewById<View>(R.id.peach_juice_amount) as TextView
        tv.text = "" + peach_juice
        total_cal()
    }

    fun peach_juice_dec(view: View?) {
        if (peach_juice >= 0) {
            peach_juice = dec(peach_juice)
            val tv = findViewById<View>(R.id.peach_juice_amount) as TextView
            if (peach_juice > 0) tv.text = "" + peach_juice else tv.text = "0"
            total_cal()
        }
    }

    fun lemonade_inc(view: View?) {
        lemonade = inc(lemonade)
        val tv = findViewById<View>(R.id.lemonade_amount) as TextView
        tv.text = "" + lemonade
        total_cal()
    }

    fun lemonade_dec(view: View?) {
        if (lemonade >= 0) {
            lemonade = dec(lemonade)
            val tv = findViewById<View>(R.id.lemonade_amount) as TextView
            if (lemonade > 0) tv.text = "" + lemonade else tv.text = "0"
            total_cal()
        }
    }

    fun non_alcoholic_beer_inc(view: View?) {
        non_alcoholic_beer = inc(non_alcoholic_beer)
        val tv = findViewById<View>(R.id.non_alcoholic_beer_amount) as TextView
        tv.text = "" + non_alcoholic_beer
        total_cal()
    }

    fun non_alcoholic_beer_dec(view: View?) {
        if (non_alcoholic_beer >= 0) {
            non_alcoholic_beer = dec(non_alcoholic_beer)
            val tv = findViewById<View>(R.id.non_alcoholic_beer_amount) as TextView
            if (non_alcoholic_beer > 0) tv.text = "" + non_alcoholic_beer else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        non_alcoholic_drinks_total = still_water * 1 + sparkling_water * 1 + coca_cola * 1 + diet_coke * 1 + dr_pepper * 1 + sprite * 1 + fanta * 1 + coffee * 2 + latte_machiatto * 3 + tea * 2 + chocolate_milkshake * 3 + fresh_orange_juice * 2 + peach_juice * 2 + lemonade * 2 + non_alcoholic_beer * 2
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (still_water > 0) {
            val tv = findViewById<View>(R.id.still_water_amount) as TextView
            tv.text = "" + still_water
        }
        if (sparkling_water > 0) {
            val tv = findViewById<View>(R.id.sparkling_water_amount) as TextView
            tv.text = "" + sparkling_water
        }
        if (coca_cola > 0) {
            val tv = findViewById<View>(R.id.coca_cola_amount) as TextView
            tv.text = "" + coca_cola
        }
        if (diet_coke > 0) {
            val tv = findViewById<View>(R.id.diet_coke_amount) as TextView
            tv.text = "" + diet_coke
        }
        if (dr_pepper > 0) {
            val tv = findViewById<View>(R.id.dr_pepper_amount) as TextView
            tv.text = "" + dr_pepper
        }
        if (sprite > 0) {
            val tv = findViewById<View>(R.id.sprite_amount) as TextView
            tv.text = "" + sprite
        }
        if (fanta > 0) {
            val tv = findViewById<View>(R.id.fanta_amount) as TextView
            tv.text = "" + fanta
        }
        if (coffee > 0) {
            val tv = findViewById<View>(R.id.coffee_amount) as TextView
            tv.text = "" + coffee
        }
        if (latte_machiatto > 0) {
            val tv = findViewById<View>(R.id.latte_machiatto_amount) as TextView
            tv.text = "" + latte_machiatto
        }
        if (tea > 0) {
            val tv = findViewById<View>(R.id.tea_amount) as TextView
            tv.text = "" + tea
        }
        if (chocolate_milkshake > 0) {
            val tv = findViewById<View>(R.id.chocolate_milkshake_amount) as TextView
            tv.text = "" + chocolate_milkshake
        }
        if (fresh_orange_juice > 0) {
            val tv = findViewById<View>(R.id.fresh_orange_juice_amount) as TextView
            tv.text = "" + fresh_orange_juice
        }
        if (peach_juice > 0) {
            val tv = findViewById<View>(R.id.peach_juice_amount) as TextView
            tv.text = "" + peach_juice
        }
        if (lemonade > 0) {
            val tv = findViewById<View>(R.id.lemonade_amount) as TextView
            tv.text = "" + lemonade
        }
        if (non_alcoholic_beer > 0) {
            val tv = findViewById<View>(R.id.non_alcoholic_beer_amount) as TextView
            tv.text = "" + non_alcoholic_beer
        }
    }

    companion object {
        var still_water = 0
        var sparkling_water = 0
        var coca_cola = 0
        var diet_coke = 0
        var dr_pepper = 0
        var sprite = 0
        var fanta = 0
        var coffee = 0
        var latte_machiatto = 0
        var tea = 0
        var chocolate_milkshake = 0
        var fresh_orange_juice = 0
        var peach_juice = 0
        var lemonade = 0
        var non_alcoholic_beer = 0
        @JvmField
        var non_alcoholic_drinks_total = 0
    }
}