package org.example.lesson_6

fun main() {
    val startRange = 1
    val endRange = 9
    val randomWinningNumber = (startRange..endRange).random()
    var triesNumber = 5

    while (triesNumber > 0) {
        println("Введите число от $startRange до $endRange")
        val userNumber = readln().toInt()
        if (userNumber == randomWinningNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            triesNumber--
            if (triesNumber > 0) {
                println("Почти попал, попробуй еще раз")
                println("Осталось попыток: $triesNumber")
            } else {
                println("Хорошая была игра, но, увы, ты проиграл")
                println("Было загадано число: $randomWinningNumber")
            }
        }
    }
}