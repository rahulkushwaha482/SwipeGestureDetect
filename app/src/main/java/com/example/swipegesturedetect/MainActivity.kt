package com.example.swipegesturedetect

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        relGenerate.setOnTouchListener(object : OnSwipeTouchListener(this@MainActivity) {

            override fun onSwipeTop() {
                super.onSwipeTop()
             //   Toast.makeText(this@MainActivity,"Top is clicked",Toast.LENGTH_LONG).show()
            }

            override fun onSwipeBottom() {
                super.onSwipeBottom()
            //    Toast.makeText(this@MainActivity,"Bottom is clicked",Toast.LENGTH_LONG).show()
            }

            override fun onSwipeLeft() {
                super.onSwipeLeft()
                Toast.makeText(this@MainActivity,"Left is clicked",Toast.LENGTH_LONG).show()
                val intent=Intent(this@MainActivity,ScannerActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
            }

            override fun onSwipeRight() {
                super.onSwipeRight()
              //  Toast.makeText(this@MainActivity,"right is clicked",Toast.LENGTH_LONG).show()
            }
        })

        relPrint.setOnTouchListener(object : OnSwipeTouchListener(this@MainActivity) {

            override fun onSwipeTop() {
                super.onSwipeTop()
            //    Toast.makeText(this@MainActivity,"Top is clicked",Toast.LENGTH_LONG).show()
            }

            override fun onSwipeBottom() {
                super.onSwipeBottom()
              //  Toast.makeText(this@MainActivity,"Bottom is clicked",Toast.LENGTH_LONG).show()
            }

            override fun onSwipeLeft() {
                super.onSwipeLeft()
             //   Toast.makeText(this@MainActivity,"Left is clicked",Toast.LENGTH_LONG).show()
            }

            override fun onSwipeRight() {
                super.onSwipeRight()

                val intent=Intent(this@MainActivity,PrinterActivity::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)

                Toast.makeText(this@MainActivity,"right is clicked",Toast.LENGTH_LONG).show()
            }
        })



    }
}
