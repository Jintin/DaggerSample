package com.jintin.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {

    fun component(): HoneyLemonadeComponent.Factory
}