package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.virtualwaiter.R.*


class SlimpleTextClientActivity : Activity() {
    override fun onBackPressed() {
        // do nothing.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_slimple_text_client)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(layout.activity_order__type, menu)
        return true
    }

    fun nextact(view: View?) {
        val table = findViewById<View>(id.table_no) as EditText
        if (table.text.toString().isEmpty()) {
            Toast.makeText(applicationContext,
                    "Please enter your table number.\nIt can be found on the sticker on your table.", Toast.LENGTH_SHORT).show()
        } else {
            val newTxt = table.text as Editable
            val tbl_no = newTxt.toString()
            tablex = tbl_no.toInt()
            if (tablex <= 25 && tablex != 0) {
                val intent = Intent(this, Order_Type::class.java)
                startActivity(intent)
                overridePendingTransition(anim.fadin, anim.fadout)
            } else {
                Toast.makeText(applicationContext,
                        "Please enter a valid table number", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        var tablex = 0
    }
}