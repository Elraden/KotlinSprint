package org.example.lesson_5

fun main() {
    val number1 = 10
    val number2 = 21

    println("Решите пример: $number1 + $number2 = ?")

    val userAnswer = readln().toInt()
    val correctAnswer = number1 + number2

    if (userAnswer == correctAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}