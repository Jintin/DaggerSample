package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerHoneyLemonadeComponent.create()
        component.inject(this)

        super.onCreate(savedInstanceState)
        // Don't need this anymore
        // honeyLemonade = component.getHoneyLemonade()

        textView.text = honeyLemonade.toString()
    }
}