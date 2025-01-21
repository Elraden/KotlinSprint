package org.example.lesson_16

import kotlin.random.Random

class Dice() {
    private val randomDiceNumber = Random.nextInt(1, 7)

    fun getRandomNumber() {
        println(randomDiceNumber)
    }
}

fun main() {
    val dice = Dice()
    dice.getRandomNumber()
}