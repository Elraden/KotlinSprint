package org.example.lesson_5

const val WINNING_NUMBER_1 = 15
const val WINNING_NUMBER_2 = 30

fun main() {
    println("Введите первое число от 0 до 42")
    val number1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val number2 = readln().toInt()

    val match1 = (number1 == WINNING_NUMBER_1 || number1 == WINNING_NUMBER_2)
    val match2 = (number2 == WINNING_NUMBER_1 || number2 == WINNING_NUMBER_2)

    val mainPrizeComparison = match1 && match2
    val consolationPrizeComparison = match1 || match2

    val resultText = if (mainPrizeComparison) "Поздравляем! Вы выиграли главный приз!"
    else if (consolationPrizeComparison) "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(resultText)
    println("Правильные числа: $WINNING_NUMBER_1 и $WINNING_NUMBER_2")
}