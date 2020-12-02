package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView


class Burgers : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {

    }

    override fun onBackPressed() {
        super.onBackPressed()

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

    }

    fun crispy_burger_dec(view: View?) {
        if (crispy_burger >= 0) {
            crispy_burger = dec(crispy_burger)

        }
    }

    fun classic_american_burger_inc(view: View?) {
        classic_american_burger = inc(classic_american_burger)

    }

    fun classic_american_burger_dec(view: View?) {
        if (classic_american_burger >= 0) {
            classic_american_burger = dec(classic_american_burger)

        }
    }

    fun golden_chicken_burger_inc(view: View?) {
        golden_chicken_burger = inc(golden_chicken_burger)

    }

    fun golden_chicken_burger_dec(view: View?) {
        if (golden_chicken_burger >= 0) {
            golden_chicken_burger = dec(golden_chicken_burger)

        }
    }

    fun red_spicy_burger_inc(view: View?) {
        red_spicy_burger = inc(red_spicy_burger)

    }

    fun red_spicy_burger_dec(view: View?) {
        if (red_spicy_burger >= 0) {
            red_spicy_burger = dec(red_spicy_burger)

        }
    }

    fun veggie_burger_inc(view: View?) {
        veggie_burger = inc(veggie_burger)

    }

    fun veggie_burger_dec(view: View?) {
        if (veggie_burger >= 0) {
            veggie_burger = dec(veggie_burger)

        }
    }

    fun halloumi_burger_inc(view: View?) {
        halloumi_burger = inc(halloumi_burger)

    }

    fun halloumi_burger_dec(view: View?) {
        if (halloumi_burger >= 0) {
            halloumi_burger = dec(halloumi_burger)

        }
    }

    fun chief_burger_inc(view: View?) {
        chief_burger = inc(chief_burger)

    }

    fun chief_burger_dec(view: View?) {
        if (chief_burger >= 0) {
            chief_burger = dec(chief_burger)

        }
    }

    fun total_cal() {
        burgers_total = crispy_burger * 7 + classic_american_burger * 6 + golden_chicken_burger * 6 + red_spicy_burger * 8 + veggie_burger * 6 + halloumi_burger * 7 + chief_burger * 12

    }

    fun main_menu(view: View?) {
        val goto_main_menu = Intent(this, Order_Type::class.java)

    }

    fun orders_list_init() {
        if (crispy_burger > 0) {

        }
        if (classic_american_burger > 0) {

        }
        if (golden_chicken_burger > 0) {

        }
        if (red_spicy_burger > 0) {

        }
        if (veggie_burger > 0) {

        }
        if (halloumi_burger > 0) {

        }
        if (chief_burger > 0) {

        }
    }
    companion object {
        var crispy_burger = 0
        var classic_american_burger = 0
        var golden_chicken_burger = 0
        var red_spicy_burger = 0
        var veggie_burger = 0
        var halloumi_burger = 0
        var chief_burger = 0
        var burgers_total = 0
    }


}