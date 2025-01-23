package org.example.lesson_18

abstract class Dice(private val sides: Int) {
    abstract fun rollDice()

    protected fun roll(): Int {
        return (1..sides).random()  // Используем общее поле sides
    }

}

class Dice4: Dice(4) {
    override fun rollDice() {
        val randomNumber = roll()
        println("На 4-х гранном кубике вы выбросили число: $randomNumber")
    }
}

class Dice6: Dice(6) {
    override fun rollDice() {
        val randomNumber = roll()
        println("На 6-х гранном кубике вы выбросили число: $randomNumber")
    }
}

class Dice8: Dice(8) {
    override fun rollDice() {
        val randomNumber = roll()
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