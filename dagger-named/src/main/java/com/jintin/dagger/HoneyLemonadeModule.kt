package com.jintin.dagger

import dagger.Module
import dagger.Provides

@Module
class HoneyLemonadeModule {

    @Provides
    @LemonFlavor
    fun provideHoneyLemon(honey: Honey, lemon: Lemon): HoneyLemonade {
        return HoneyLemonade(honey, lemon)
    }

    @Provides
    @LymeFlavor
    fun provideHoneyLyme(honey: Honey, lyme: Lyme): HoneyLemonade {
        return HoneyLemonade(honey, lyme)
    }
}