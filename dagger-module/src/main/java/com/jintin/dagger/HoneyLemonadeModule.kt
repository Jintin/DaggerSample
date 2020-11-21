package com.jintin.dagger

import dagger.Binds
import dagger.Module

@Module
abstract class HoneyLemonadeModule {
    //    @Provides
    //    fun provideLemon(water: Water): Lemon {
    //        return Lyme(water)
    //    }
    @Binds
    abstract fun provideLemon(lyme: Lyme): Lemon
}