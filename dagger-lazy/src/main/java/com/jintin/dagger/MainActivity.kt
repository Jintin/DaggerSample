package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.Lazy
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var lazy: Lazy<HoneyLemonade>

    @Inject
    lateinit var provider: Provider<HoneyLemonade>

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerHoneyLemonadeComponent.create()
        component.inject(this)
        super.onCreate(savedInstanceState)

        println("lazy get equal:" + (lazy.get() == lazy.get()))
        println("provider get equal:" + (provider.get() == provider.get()))
    }
}