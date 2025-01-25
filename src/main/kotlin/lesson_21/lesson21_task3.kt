package org.example.lesson_21

class NewPlayer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun NewPlayer.isHealthy(): Boolean = currentHealth == maxHealth

fun main() {
    val player1 = NewPlayer("Elcora", 50, 100 )
    println("У пользователя ${player1.name} максимальное здоровье: ${player1.isHealthy()}")

    val player2 = NewPlayer("Henam", 100, 100)
    println("У пользователя ${player2.name} максимальное здоровье: ${player2.isHealthy()}")
}