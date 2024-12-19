package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите Ваш год рождения")
    val birthYear = readln().toInt()

    val currentDate = LocalDate.now()
    val currentYear = currentDate.year

    val userAge = currentYear - birthYear
    val comparisonResult = userAge >= AGE_OF_MAJORITY

    val resultText = if (comparisonResult) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)
}