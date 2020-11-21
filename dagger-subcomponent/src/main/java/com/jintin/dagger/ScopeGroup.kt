package com.jintin.dagger

import javax.inject.Scope

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class FragmentScope

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class LoginScope