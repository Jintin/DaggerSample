package com.jintin.dagger

import dagger.Component

@Component
interface HoneyLemonadeComponent {
    fun getHoneyLemonade(): HoneyLemonade

    fun inject(mainActivity: MainActivity)
}