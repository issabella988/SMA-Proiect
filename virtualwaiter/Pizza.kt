package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.virtualwaiter.Order_Type

class Pizza : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
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

    fun pizza_margherita_inc(view: View?) {
        pizza_margherita = inc(pizza_margherita)
        val tv = findViewById<View>(R.id.pizza_margherita_amount) as TextView
        tv.text = "" + pizza_margherita
        total_cal()
    }

    fun pizza_margherita_dec(view: View?) {
        if (pizza_margherita >= 0) {
            pizza_margherita = dec(pizza_margherita)
            val tv = findViewById<View>(R.id.pizza_margherita_amount) as TextView
            if (pizza_margherita > 0) tv.text = "" + pizza_margherita else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_vegan_inc(view: View?) {
        pizza_vegan = inc(pizza_vegan)
        val tv = findViewById<View>(R.id.pizza_vegan_amount) as TextView
        tv.text = "" + pizza_vegan
        total_cal()
    }

    fun pizza_vegan_dec(view: View?) {
        if (pizza_vegan >= 0) {
            pizza_vegan = dec(pizza_vegan)
            val tv = findViewById<View>(R.id.pizza_vegan_amount) as TextView
            if (pizza_vegan > 0) tv.text = "" + pizza_vegan else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_4_cheese_inc(view: View?) {
        pizza_4_cheese = inc(pizza_4_cheese)
        val tv = findViewById<View>(R.id.pizza_4_cheese_amount) as TextView
        tv.text = "" + pizza_4_cheese
        total_cal()
    }

    fun pizza_4_cheese_dec(view: View?) {
        if (pizza_4_cheese >= 0) {
            pizza_4_cheese = dec(pizza_4_cheese)
            val tv = findViewById<View>(R.id.pizza_4_cheese_amount) as TextView
            if (pizza_4_cheese > 0) tv.text = "" + pizza_4_cheese else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_pepperoni_inc(view: View?) {
        pizza_pepperoni = inc(pizza_pepperoni)
        val tv = findViewById<View>(R.id.pizza_pepperoni_amount) as TextView
        tv.text = "" + pizza_pepperoni
        total_cal()
    }

    fun pizza_pepperoni_dec(view: View?) {
        if (pizza_pepperoni >= 0) {
            pizza_pepperoni = dec(pizza_pepperoni)
            val tv = findViewById<View>(R.id.pizza_pepperoni_amount) as TextView
            if (pizza_pepperoni > 0) tv.text = "" + pizza_pepperoni else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_meat_passion_inc(view: View?) {
        pizza_meat_passion = inc(pizza_meat_passion)
        val tv = findViewById<View>(R.id.pizza_meat_passion_amount) as TextView
        tv.text = "" + pizza_meat_passion
        total_cal()
    }

    fun pizza_meat_passion_dec(view: View?) {
        if (pizza_meat_passion >= 0) {
            pizza_meat_passion = dec(pizza_meat_passion)
            val tv = findViewById<View>(R.id.pizza_meat_passion_amount) as TextView
            if (pizza_meat_passion > 0) tv.text = "" + pizza_meat_passion else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_deluxe_inc(view: View?) {
        pizza_deluxe = inc(pizza_deluxe)
        val tv = findViewById<View>(R.id.pizza_deluxe_amount) as TextView
        tv.text = "" + pizza_deluxe
        total_cal()
    }

    fun pizza_deluxe_dec(view: View?) {
        if (pizza_deluxe >= 0) {
            pizza_deluxe = dec(pizza_deluxe)
            val tv = findViewById<View>(R.id.pizza_deluxe_amount) as TextView
            if (pizza_deluxe > 0) tv.text = "" + pizza_deluxe else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_diavola_inc(view: View?) {
        pizza_diavola = inc(pizza_diavola)
        val tv = findViewById<View>(R.id.pizza_diavola_amount) as TextView
        tv.text = "" + pizza_diavola
        total_cal()
    }

    fun pizza_diavola_dec(view: View?) {
        if (pizza_diavola >= 0) {
            pizza_diavola = dec(pizza_diavola)
            val tv = findViewById<View>(R.id.pizza_diavola_amount) as TextView
            if (pizza_diavola > 0) tv.text = "" + pizza_diavola else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_ham_mushroom_inc(view: View?) {
        pizza_ham_mushroom = inc(pizza_ham_mushroom)
        val tv = findViewById<View>(R.id.pizza_ham_mushroom_amount) as TextView
        tv.text = "" + pizza_ham_mushroom
        total_cal()
    }

    fun pizza_ham_mushroom_dec(view: View?) {
        if (pizza_ham_mushroom >= 0) {
            pizza_ham_mushroom = dec(pizza_ham_mushroom)
            val tv = findViewById<View>(R.id.pizza_ham_mushroom_amount) as TextView
            if (pizza_ham_mushroom > 0) tv.text = "" + pizza_ham_mushroom else tv.text = "0"
            total_cal()
        }
    }

    fun pizza_bbq_chicken_inc(view: View?) {
        pizza_bbq_chicken = inc(pizza_bbq_chicken)
        val tv = findViewById<View>(R.id.pizza_bbq_chicken_amount) as TextView
        tv.text = "" + pizza_bbq_chicken
        total_cal()
    }

    fun pizza_bbq_chicken_dec(view: View?) {
        if (pizza_bbq_chicken >= 0) {
            pizza_bbq_chicken = dec(pizza_bbq_chicken)
            val tv = findViewById<View>(R.id.pizza_bbq_chicken_amount) as TextView
            if (pizza_bbq_chicken > 0) tv.text = "" + pizza_bbq_chicken else tv.text = "0"
            total_cal()
        }
    }

    fun total_cal() {
        pizza_total = pizza_margherita * 6 + pizza_vegan * 8 + pizza_4_cheese * 10 + pizza_pepperoni * 11 + pizza_meat_passion * 14 + pizza_deluxe * 15 + pizza_diavola * 10 + pizza_ham_mushroom * 9 + pizza_bbq_chicken * 13
        finalize_order.all_total = Breakfast.breakfast_total + Appetizers.appetizers_total + Soup.soup_total + MainCourse.main_course_total + pizza_total + Burgers.burgers_total + Salads.salads_total + Seafood.seafood_total + Desserts.desserts_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + AlcoholicDrinks.alcoholic_drinks_total
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
        if (pizza_margherita > 0) {
            val tv = findViewById<View>(R.id.pizza_margherita_amount) as TextView
            tv.text = "" + pizza_margherita
        }
        if (pizza_vegan > 0) {
            val tv = findViewById<View>(R.id.pizza_vegan_amount) as TextView
            tv.text = "" + pizza_vegan
        }
        if (pizza_4_cheese > 0) {
            val tv = findViewById<View>(R.id.pizza_4_cheese_amount) as TextView
            tv.text = "" + pizza_4_cheese
        }
        if (pizza_pepperoni > 0) {
            val tv = findViewById<View>(R.id.pizza_pepperoni_amount) as TextView
            tv.text = "" + pizza_pepperoni
        }
        if (pizza_meat_passion > 0) {
            val tv = findViewById<View>(R.id.pizza_meat_passion_amount) as TextView
            tv.text = "" + pizza_meat_passion
        }
        if (pizza_deluxe > 0) {
            val tv = findViewById<View>(R.id.pizza_deluxe_amount) as TextView
            tv.text = "" + pizza_deluxe
        }
        if (pizza_diavola > 0) {
            val tv = findViewById<View>(R.id.pizza_diavola_amount) as TextView
            tv.text = "" + pizza_diavola
        }
        if (pizza_ham_mushroom > 0) {
            val tv = findViewById<View>(R.id.pizza_ham_mushroom_amount) as TextView
            tv.text = "" + pizza_ham_mushroom
        }
        if (pizza_bbq_chicken > 0) {
            val tv = findViewById<View>(R.id.pizza_bbq_chicken_amount) as TextView
            tv.text = "" + pizza_bbq_chicken
        }
    }

    companion object {
        @JvmField
        var pizza_margherita = 0
        @JvmField
        var pizza_vegan = 0
        @JvmField
        var pizza_4_cheese = 0
        @JvmField
        var pizza_pepperoni = 0
        @JvmField
        var pizza_meat_passion = 0
        @JvmField
        var pizza_deluxe = 0
        @JvmField
        var pizza_diavola = 0
        @JvmField
        var pizza_ham_mushroom = 0
        @JvmField
        var pizza_bbq_chicken = 0
        @JvmField
        var pizza_total = 0
    }
}