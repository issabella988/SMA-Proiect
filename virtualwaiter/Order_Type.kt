package com.example.virtualwaiter

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.virtualwaiter.AlcoholicDrinks
import com.example.virtualwaiter.Appetizers
import com.example.virtualwaiter.Breakfast
import com.example.virtualwaiter.Burgers
import com.example.virtualwaiter.Desserts
import com.example.virtualwaiter.MainCourse
import com.example.virtualwaiter.NonAlcoholicDrinks
import com.example.virtualwaiter.R.layout
import com.example.virtualwaiter.finalize_order

class Order_Type : Activity() {
    override fun onBackPressed() {
        // do nothing.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_order__type)
        val tv = findViewById<View>(R.id.total_so_far) as TextView
        val total = Breakfast.breakfast_total + Appetizers.appetizers_total + Burgers.burgers_total + Desserts.desserts_total + MainCourse.main_course_total + NonAlcoholicDrinks.non_alcoholic_drinks_total + Pizza.pizza_total + Salads.salads_total + Seafood.seafood_total + Soup.soup_total //de adaugat toate pe parcurs!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        tv.text = "$$total"
    }

    fun breakfast(view: View?) {
        val nextact = Intent(this, Breakfast::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun appetizers(view: View?) {
        val nextact = Intent(this, Appetizers::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun soup(view: View?) {
        val nextact = Intent(this, Soup::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun mainCourse(view: View?) {
        val nextact = Intent(this, MainCourse::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun pizza(view: View?) {
        val nextact = Intent(this, Pizza::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun burgers(view: View?) {
        val nextact = Intent(this, Burgers::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun salads(view: View?) {
        val nextact = Intent(this, Salads::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun seafood(view: View?) {
        val nextact = Intent(this, Seafood::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun desserts(view: View?) {
        val nextact = Intent(this, Desserts::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun nonAlcoholicDrinks(view: View?) {
        val nextact = Intent(this, NonAlcoholicDrinks::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun alcoholicDrinks(view: View?) {
        val nextact = Intent(this, AlcoholicDrinks::class.java)
        startActivity(nextact)
        overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out)
    }

    fun fin_ord(view: View?) {
        val o: Any = this
        if (finalize_order.all_total > 0) {
            val fin = Intent(this, finalize_order::class.java)
            startActivity(fin)
            overridePendingTransition(R.anim.fadin, R.anim.fadout)
        } else {
            if (finalize_order.next_ord_flag == 1) {
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Are you sure you don't want to place another order?")
                        .setCancelable(false)
                        .setPositiveButton("Yes") { dialog, id ->
                            val nextact = Intent(o as Order_Type, thankyou::class.java)
                            startActivity(nextact)
                        }
                        .setNegativeButton("No") { dialog, id -> dialog.cancel() }
                val alert = builder.create()
                alert.show()
            } else {
                Toast.makeText(applicationContext,
                        "Please select your order.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        var new_ord_flag = 0
    }
}