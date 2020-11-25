package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var honeyLemonade: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        honeyLemonade = HoneyLemonade(Honey(Bee()), Lemon())
        textView.text = honeyLemonade.toString()
    }
}