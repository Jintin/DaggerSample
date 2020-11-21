package com.jintin.dagger

import javax.inject.Inject

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

class Bee @Inject constructor()

open class Lemon

class Lyme @Inject constructor(val water: Water) : Lemon()

class Water @Inject constructor()