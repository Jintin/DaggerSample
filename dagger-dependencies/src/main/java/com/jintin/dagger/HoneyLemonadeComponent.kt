package com.jintin.dagger

import com.jintin.dagger.base.ApplicationComponent
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class])
interface HoneyLemonadeComponent {

    fun provideHoneyLemonade(): HoneyLemonade

    @Component.Factory
    interface Factory {
        fun create(applicationComponent: ApplicationComponent): HoneyLemonadeComponent
    }
}