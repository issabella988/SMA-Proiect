package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Desserts : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desserts)
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

    fun chocolate_chip_cookies_inc(view: View?) {
        chocolate_chip_cookies = inc(chocolate_chip_cookies)
        val tv = findViewById<View>(R.id.chocolate_chip_cookies_amount) as TextView
        tv.text = "" + chocolate_chip_cookies
        total_cal()
    }

    fun chocolate_chip_cookies_dec(view: View?) {
        if (chocolate_chip_cookies >= 0) {
            chocolate_chip_cookies = dec(chocolate_chip_cookies)
            val tv = findViewById<View>(R.id.chocolate_chip_cookies_amount) as TextView
            if (chocolate_chip_cookies > 0) tv.text = "" + chocolate_chip_cookies else tv.text = "0"
            total_cal()
        }
    }

    fun vanilla_cheesecake_inc(view: View?) {
        vanilla_cheesecake = inc(vanilla_cheesecake)
        val tv = findViewById<View>(R.id.vanilla_cheesecake_amount) as TextView
        tv.text = "" + vanilla_cheesecake
        total_cal()
    }

    fun vanilla_cheesecake_dec(view: View?) {
        if (vanilla_cheesecake >= 0) {
            vanilla_cheesecake = dec(vanilla_cheesecake)
            val tv = findViewById<View>(R.id.vanilla_cheesecake_amount) as TextView
            if (vanilla_cheesecake > 0) tv.text = "" + vanilla_cheesecake else tv.text = "0"
            total_cal()
        }
    }

    fun amaretto_apple_cupcakes_inc(view: View?) {
        amaretto_apple_cupcakes = inc(amaretto_apple_cupcakes)
        val tv = findViewById<View>(R.id.amaretto_apple_cupcakes_amount) as TextView
        tv.text = "" + amaretto_apple_cupcakes
        total_cal()
    }

    fun amaretto_apple_cupcakes_dec(view: View?) {
        if (amaretto_apple_cupcakes >= 0) {
            amaretto_apple_cupcakes = dec(amaretto_apple_cupcakes)
            val tv = findViewById<View>(R.id.amaretto_apple_cupcakes_amount) as TextView
            if (amaretto_apple_cupcakes > 0) tv.text = "" + amaretto_apple_cupcakes else tv.text = "0"
            total_cal()
        }
    }

    fun tiramisu_inc(view: View?) {
        tiramisu = inc(tiramisu)
        val tv = findViewById<View>(R.id.tiramisu_amount) as TextView
        tv.text = "" + tiramisu
        total_cal()
    }

    fun tiramisu_dec(view: View?) {
        if (tiramisu >= 0) {
            tiramisu = dec(tiramisu)
            val tv = findViewById<View>(R.id.tiramisu_amount) as TextView
            if (tiramisu > 0) tv.text = "" + tiramisu else tv.text = "0"
            total_cal()
        }
    }

    fun cinnamon_apple_cake_inc(view: View?) {
        cinnamon_apple_cake = inc(cinnamon_apple_cake)
        val tv = findViewById<View>(R.id.cinnamon_apple_cake_amount) as TextView
        tv.text = "" + cinnamon_apple_cake
        total_cal()
    }

    fun cinnamon_apple_cake_dec(view: View?) {
        if (cinnamon_apple_cake >= 0) {
            cinnamon_apple_cake = dec(cinnamon_apple_cake)
            val tv = findViewById<View>(R.id.cinnamon_apple_cake_amount) as TextView
            if (cinnamon_apple_cake > 0) tv.text = "" + cinnamon_apple_cake else tv.text = "0"
            total_cal()
        }
    }

    fun pumpkin_pie_pudding_inc(view: View?) {
        pumpkin_pie_pudding = inc(pumpkin_pie_pudding)
        val tv = findViewById<View>(R.id.pumpkin_pie_pudding_amount) as TextView
        tv.text = "" + pumpkin_pie_pudding
        total_cal()
    }

    fun pumpkin_pie_pudding_dec(view: View?) {
        if (pumpkin_pie_pudding >= 0) {
            pumpkin_pie_pudding = dec(pumpkin_pie_pudding)
            val tv = findViewById<View>(R.id.pumpkin_pie_pudding_amount) as TextView
            if (pumpkin_pie_pudding > 0) tv.text = "" + pumpkin_pie_pudding else tv.text = "0"
            total_cal()
        }
    }

    fun chocolate_cherry_sorbet_inc(view: View?) {
        chocolate_cherry_sorbet = inc(chocolate_cherry_sorbet)
        val tv = findViewById<View>(R.id.chocolate_cherry_sorbet_amount) as TextView
        tv.text = "" + chocolate_cherry_sorbet
        total_cal()
    }

    fun chocolate_cherry_sorbet_dec(view: View?) {
        if (chocolate_cherry_sorbet >= 0) {
            chocolate_cherry_sorbet = dec(chocolate_cherry_sorbet)
            val tv = findViewById<View>(R.id.chocolate_cherry_sorbet_amount) as TextView
            if (chocolate_cherry_sorbet > 0) tv.text = "" + chocolate_cherry_sorbet else tv.text = "0"
            total_cal()
        }
    }

    fun lemon_tart_inc(view: View?) {
        lemon_tart = inc(lemon_tart)
        val tv = findViewById<View>(R.id.lemon_tart_amount) as TextView
        tv.text = "" + lemon_tart
        total_cal()
    }

    fun lemon_tart_dec(view: View?) {
        if (lemon_tart >= 0) {
            lemon_tart = dec(lemon_tart)
            val tv = findViewById<View>(R.id.lemon_tart_amount) as TextView
            if (lemon_tart > 0) tv.text = "" + lemon_tart else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        desserts_total = chocolate_chip_cookies * 3 + vanilla_cheesecake * 5 + amaretto_apple_cupcakes * 4 + tiramisu * 5 + cinnamon_apple_cake * 4 + pumpkin_pie_pudding * 4 + chocolate_cherry_sorbet * 5 + lemon_tart * 4
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (chocolate_chip_cookies > 0) {
            val tv = findViewById<View>(R.id.chocolate_chip_cookies_amount) as TextView
            tv.text = "" + chocolate_chip_cookies
        }
        if (vanilla_cheesecake > 0) {
            val tv = findViewById<View>(R.id.vanilla_cheesecake_amount) as TextView
            tv.text = "" + vanilla_cheesecake
        }
        if (amaretto_apple_cupcakes > 0) {
            val tv = findViewById<View>(R.id.amaretto_apple_cupcakes_amount) as TextView
            tv.text = "" + amaretto_apple_cupcakes
        }
        if (tiramisu > 0) {
            val tv = findViewById<View>(R.id.tiramisu_amount) as TextView
            tv.text = "" + tiramisu
        }
        if (cinnamon_apple_cake > 0) {
            val tv = findViewById<View>(R.id.cinnamon_apple_cake_amount) as TextView
            tv.text = "" + cinnamon_apple_cake
        }
        if (lemon_tart > 0) {
            val tv = findViewById<View>(R.id.lemon_tart_amount) as TextView
            tv.text = "" + lemon_tart
        }
        if (pumpkin_pie_pudding > 0) {
            val tv = findViewById<View>(R.id.pumpkin_pie_pudding_amount) as TextView
            tv.text = "" + pumpkin_pie_pudding
        }
        if (chocolate_cherry_sorbet > 0) {
            val tv = findViewById<View>(R.id.chocolate_cherry_sorbet_amount) as TextView
            tv.text = "" + chocolate_cherry_sorbet
        }
    }

    companion object {
        var chocolate_chip_cookies = 0
        var vanilla_cheesecake = 0
        var amaretto_apple_cupcakes = 0
        var tiramisu = 0
        var cinnamon_apple_cake = 0
        var pumpkin_pie_pudding = 0
        var chocolate_cherry_sorbet = 0
        var lemon_tart = 0
        @JvmField
        var desserts_total = 0
    }
}