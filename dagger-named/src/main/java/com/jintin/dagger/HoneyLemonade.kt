package com.jintin.dagger

import javax.inject.Inject

class HoneyLemonade(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

class Bee @Inject constructor()

open class Lemon @Inject constructor()

class Lyme @Inject constructor() : Lemon()