package com.jintin.daggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val honeyLemonade = HoneyLemonade(Honey(Bee()), Lemon())
        textView.text = honeyLemonade.toString()
    }
}