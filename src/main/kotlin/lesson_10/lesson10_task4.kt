package org.example.lesson_10

fun main() {
    var userWins = 0
    while (true) {
        val result = startRound()
        if (result == "Победило человечество") {
            userWins++
        }
        println(result)
        println("Хотите сыграть еще раз?")
        val answer = readln()
        if (answer.equals("нет", ignoreCase = true)) {
            println("Количество побед пользователя: $userWins")
            break
        }
    }
}

fun startRound(): String {
    println("Ход человека:")
    val userRoll = rollDice()
    println("На кубиках у человека выпало: $userRoll")
    println("Ход компьютера:")
    val compRoll = rollDice()
    println("На кубиках у компьютера выпало: $compRoll")
    return printResult(userRoll, compRoll)
}

fun printResult(userRoll: Int, compRoll: Int): String {
    val result = when {
        userRoll > compRoll -> "Победило человечество"
        compRoll > userRoll -> "Победила машина"
        else -> "Победила дружба"
    }
    return result
}

fun rollDice(): Int {
    return (1..6).random()
}