package com.jintin.dagger.base

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {

    fun provideBee(): Bee
}