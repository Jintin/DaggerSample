package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    @LemonFlavor
    lateinit var honeyLemon: HoneyLemonade

    @Inject
    @LymeFlavor
    lateinit var honeyLyme: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerHoneyLemonadeComponent.create()
        component.inject(this)
        super.onCreate(savedInstanceState)

        println("honeyLemon type: " + honeyLemon.lemon.javaClass)
        println("honeyLyme  type: " + honeyLyme.lemon.javaClass)
    }
}