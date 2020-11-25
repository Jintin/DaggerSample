package com.jintin.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    @Inject
    @Named("LymeFlavor")
    lateinit var honeyLyme: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println(honeyLemonade)
        println(honeyLyme)
    }
}