package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val baseComponent = DaggerApplicationComponent.create()
        val component = baseComponent.component().create()
        val component2 = baseComponent.component().create()
        val obj = component.provideHoneyLemonade()
        val obj2 = component2.provideHoneyLemonade()
        val obj3 = component2.provideHoneyLemonade()

        println("honey equal: " + (obj.honey == obj2.honey))
        println("bee   equal: " + (obj.honey.bee == obj2.honey.bee))
        println("lemon equal: " + (obj.lemon == obj2.lemon))
        println("lemon equal: " + (obj2.lemon == obj3.lemon))
    }
}