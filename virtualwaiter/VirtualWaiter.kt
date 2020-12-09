package com.example.virtualwaiter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.virtualwaiter.SlimpleTextClientActivity
import java.util.*


var orderID = 0


class VirtualWaiter : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rand = Random()
        orderID = rand.nextInt(899999)
        orderID = orderID + 100000
        setContentView(R.layout.activity_virtual_waitress)
        val startTimer: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(1000)
                    val intent0 = Intent(this@VirtualWaiter, SlimpleTextClientActivity::class.java)
                    startActivity(intent0)
                    overridePendingTransition(R.anim.fadin, R.anim.fadout)
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
        startTimer.start()
    }

    companion object {
        public var orderID = 0
    }
}