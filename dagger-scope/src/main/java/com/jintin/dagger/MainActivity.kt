package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    @Inject
    lateinit var honeyLemonade2: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerHoneyLemonadeComponent.create()
        component.inject(this)

        super.onCreate(savedInstanceState)

        val honeyLemonade3 = component.getHoneyLemonade()

        println(
            "${honeyLemonade.honey.bee}:" +
                    "${honeyLemonade2.honey.bee}:" +
                    "${honeyLemonade3.honey.bee}"
        )
    }
}