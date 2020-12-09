package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Appetizers : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appetizers)
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

    fun artichoke_inc(view: View?) {
        artichoke = inc(artichoke)
        val tv = findViewById<View>(R.id.artichoke_amount) as TextView
        tv.text = "" + artichoke
        total_cal()
    }

    fun artichoke_dec(view: View?) {
        if (artichoke >= 0) {
            artichoke = dec(artichoke)
            val tv = findViewById<View>(R.id.artichoke_amount) as TextView
            if (artichoke > 0) tv.text = "" + artichoke else tv.text = "0"
            total_cal()
        }
    }

    fun bruschetta_inc(view: View?) {
        bruschetta = inc(bruschetta)
        val tv = findViewById<View>(R.id.bruschetta_amount) as TextView
        tv.text = "" + bruschetta
        total_cal()
    }

    fun bruschetta_dec(view: View?) {
        if (bruschetta >= 0) {
            bruschetta = dec(bruschetta)
            val tv = findViewById<View>(R.id.bruschetta_amount) as TextView
            if (bruschetta > 0) tv.text = "" + bruschetta else tv.text = "0"
            total_cal()
        }
    }

    fun stuffed_mushrooms_inc(view: View?) {
        stuffed_mushrooms = inc(stuffed_mushrooms)
        val tv = findViewById<View>(R.id.stuffed_mushrooms_amount) as TextView
        tv.text = "" + stuffed_mushrooms
        total_cal()
    }

    fun stuffed_mushrooms_dec(view: View?) {
        if (stuffed_mushrooms >= 0) {
            stuffed_mushrooms = dec(stuffed_mushrooms)
            val tv = findViewById<View>(R.id.stuffed_mushrooms_amount) as TextView
            if (stuffed_mushrooms > 0) tv.text = "" + stuffed_mushrooms else tv.text = "0"
            total_cal()
        }
    }

    fun fried_calamari_inc(view: View?) {
        fried_calamari = inc(fried_calamari)
        val tv = findViewById<View>(R.id.fried_calamari_amount) as TextView
        tv.text = "" + fried_calamari
        total_cal()
    }

    fun fried_calamari_dec(view: View?) {
        if (fried_calamari >= 0) {
            fried_calamari = dec(fried_calamari)
            val tv = findViewById<View>(R.id.fried_calamari_amount) as TextView
            if (fried_calamari > 0) tv.text = "" + fried_calamari else tv.text = "0"
            total_cal()
        }
    }

    fun four_cheese_garlic_bread_inc(view: View?) {
        four_cheese_garlic_bread = inc(four_cheese_garlic_bread)
        val tv = findViewById<View>(R.id.four_cheese_garlic_bread_amount) as TextView
        tv.text = "" + four_cheese_garlic_bread
        total_cal()
    }

    fun four_cheese_garlic_bread_dec(view: View?) {
        if (four_cheese_garlic_bread >= 0) {
            four_cheese_garlic_bread = dec(four_cheese_garlic_bread)
            val tv = findViewById<View>(R.id.four_cheese_garlic_bread_amount) as TextView
            if (four_cheese_garlic_bread > 0) tv.text = "" + four_cheese_garlic_bread else tv.text = "0"
            total_cal()
        }
    }

    fun shrimp_scampi_inc(view: View?) {
        shrimp_scampi = inc(shrimp_scampi)
        val tv = findViewById<View>(R.id.shrimp_scampi_amount) as TextView
        tv.text = "" + shrimp_scampi
        total_cal()
    }

    fun shrimp_scampi_dec(view: View?) {
        if (shrimp_scampi >= 0) {
            shrimp_scampi = dec(shrimp_scampi)
            val tv = findViewById<View>(R.id.shrimp_scampi_amount) as TextView
            if (shrimp_scampi > 0) tv.text = "" + shrimp_scampi else tv.text = "0"
            total_cal()
        }
    }

    fun french_fries_inc(view: View?) {
        french_fries = inc(french_fries)
        val tv = findViewById<View>(R.id.french_fries_amount) as TextView
        tv.text = "" + french_fries
        total_cal()
    }

    fun french_fries_dec(view: View?) {
        if (french_fries >= 0) {
            french_fries = dec(french_fries)
            val tv = findViewById<View>(R.id.french_fries_amount) as TextView
            if (french_fries > 0) tv.text = "" + french_fries else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        appetizers_total = artichoke * 7 + bruschetta * 8 + stuffed_mushrooms * 7 + fried_calamari * 9 + four_cheese_garlic_bread * 4 + shrimp_scampi * 10 + french_fries * 5
        finalize_order.all_total = Breakfast.breakfast_total + appetizers_total + Soup.soup_total + MainCourse.main_course_total + Pizza.pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (artichoke > 0) {
            val tv = findViewById<View>(R.id.artichoke_amount) as TextView
            tv.text = "" + artichoke
        }
        if (bruschetta > 0) {
            val tv = findViewById<View>(R.id.bruschetta_amount) as TextView
            tv.text = "" + bruschetta
        }
        if (stuffed_mushrooms > 0) {
            val tv = findViewById<View>(R.id.stuffed_mushrooms_amount) as TextView
            tv.text = "" + stuffed_mushrooms
        }
        if (fried_calamari > 0) {
            val tv = findViewById<View>(R.id.fried_calamari_amount) as TextView
            tv.text = "" + fried_calamari
        }
        if (four_cheese_garlic_bread > 0) {
            val tv = findViewById<View>(R.id.four_cheese_garlic_bread_amount) as TextView
            tv.text = "" + four_cheese_garlic_bread
        }
        if (shrimp_scampi > 0) {
            val tv = findViewById<View>(R.id.shrimp_scampi_amount) as TextView
            tv.text = "" + shrimp_scampi
        }
        if (french_fries > 0) {
            val tv = findViewById<View>(R.id.french_fries_amount) as TextView
            tv.text = "" + french_fries
        }
    }

    companion object {
        @JvmField
        var artichoke = 0
        @JvmField
        var bruschetta = 0
        @JvmField
        var stuffed_mushrooms = 0
        @JvmField
        var fried_calamari = 0
        @JvmField
        var four_cheese_garlic_bread = 0
        @JvmField
        var shrimp_scampi = 0
        @JvmField
        var french_fries = 0
        @JvmField
        var appetizers_total = 0
    }
}