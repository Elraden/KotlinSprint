package org.example.lesson_10

fun main() {
    println("Ход игрока")
    val playerDice = rollDice()
    println("На кубике игрока выпало: $playerDice")

    println("Ход компьютера")
    val compDice = rollDice()
    println("На кубике компьютера выпало: $compDice")

    val result = when {
        playerDice > compDice -> "Победило человечество"
        playerDice < compDice -> "Победила машина"
        else -> "Победила дружба"
    }
    println(result)
}

fun rollDice(): Int {
    return (1..6).random()
}