package com.jintin.dagger

import dagger.Component

//@Singleton
@ActivityScope
@Component
interface HoneyLemonadeComponent {
    fun getHoneyLemonade(): HoneyLemonade

    fun inject(mainActivity: MainActivity)
}