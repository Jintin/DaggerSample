package com.jintin.dagger

import dagger.Component

@Component(modules = [HoneyLemonadeModule::class])
interface HoneyLemonadeComponent {

    fun inject(mainActivity: MainActivity)
}