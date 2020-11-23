package com.jintin.dagger

import com.jintin.dagger.base.Bee
import javax.inject.Inject

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

@ActivityScope
class Lemon @Inject constructor()