package org.example.lesson_18

abstract class Dice {
    abstract fun rollDice()
}

class Dice4: Dice() {
    override fun rollDice() {
        val randomNumber = (1..4).random()
        println("На 4-х гранном кубике вы выбросили число: $randomNumber")
    }
}

class Dice6: Dice() {
    override fun rollDice() {
        val randomNumber = (1..6).random()
        println("На 6-х гранном кубике вы выбросили число: $randomNumber")
    }
}

class Dice8: Dice() {
    override fun rollDice() {
        val randomNumber = (1..8).random()
        println("На 8-х гранном кубике вы выбросили число: $randomNumber")
    }
}

fun main() {
    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()

    val listOfDices: List<Dice> = listOf(dice4, dice6, dice8)

    listOfDices.forEach {
        it.rollDice()
        println()
    }
}