package com.jintin.dagger

import dagger.Subcomponent
import javax.inject.Inject

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

class Bee @Inject constructor()

class Lemon @Inject constructor()