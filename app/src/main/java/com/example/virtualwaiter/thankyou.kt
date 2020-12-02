package com.example.virtualwaiter
import android.R
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View


class thankyou : Activity() {
    override fun onBackPressed() {
    
    }

    override fun onCreate(savedInstanceState: Bundle?) {

    }

    fun main_menu(view: View?) {
        finalize_order.next_ord_flag = 1
        finalize_order.old_ord_string = finalize_order.order_string + finalize_order.old_ord_string
        finalize_order.old_all_total = finalize_order.all_total


        Breakfast.english_bf = 0
        Breakfast.chicken_quiche = 0
        Breakfast.french_toast = 0
        Breakfast.frittata = 0
        Breakfast.sausage_omelet = 0
        Breakfast.denver = 0
        Breakfast.scrambled_eggs = 0
        Breakfast.breakfast_total = 0
        Appetizers.french_fries = 0
        Appetizers.shrimp_scampi = 0
        Appetizers.four_cheese_garlic_bread = 0
        Appetizers.fried_calamari = 0
        Appetizers.stuffed_mushrooms = 0
        Appetizers.bruschetta = 0
        Appetizers.artichoke = 0
        Appetizers.appetizers_total = 0
        Soup.tomato_soup = 0
        Soup.pumpkin_soup = 0
        Soup.cream_of_cauliflower_soup = 0
        Soup.vegetable_bacon_risoni_soup = 0
        Soup.chicken_noodle_soup = 0
        Soup.soup_total = 0
        MainCourse.mac_and_cheese = 0
        MainCourse.grilled_salmon = 0
        MainCourse.lasagna = 0
        MainCourse.slow_cooked_pulled_pork = 0
        MainCourse.parmesan_spring_chicken = 0
        MainCourse.mustard_stuffed_chicken = 0
        MainCourse.main_course_total = 0
        Burgers.chief_burger = 0
        Burgers.halloumi_burger = 0
        Burgers.veggie_burger = 0
        Burgers.red_spicy_burger = 0
        Burgers.golden_chicken_burger = 0
        Burgers.classic_american_burger = 0
        Burgers.crispy_burger = 0
        Burgers.burgers_total = 0
        Pizza.pizza_bbq_chicken = 0
        Pizza.pizza_ham_mushroom = 0
        Pizza.pizza_diavola = 0
        Pizza.pizza_deluxe = 0
        Pizza.pizza_meat_passion = 0
        Pizza.pizza_pepperoni = 0
        Pizza.pizza_4_cheese = 0
        Pizza.pizza_margherita = 0
        Pizza.pizza_vegan = 0
        Pizza.pizza_total = 0
        Salads.caesar_salad = 0
        Salads.caprese_salad_pesto_sauce = 0
        Salads.asian_sesame_chicken_salad = 0
        Salads.bbq_potato_salad = 0
        Salads.carrot_salad_black_grape_dressing = 0
        Salads.watermelon_olive_feta_salad = 0
        Salads.salads_total = 0
        val menu = Intent(this, Order_Type::class.java)
        startActivity(menu)
    }
}