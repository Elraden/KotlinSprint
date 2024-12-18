package org.example.lesson_5

fun main() {
    val winningNumber1 = 15
    val winningNumber2 = 30

    println("Введите первое число от 0 до 42")
    val number1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val number2 = readln().toInt()

    val match1 = (number1 == winningNumber1 || number1 == winningNumber2)
    val match2 = (number2 == winningNumber1 || number2 == winningNumber2)

    val mainPrizeComparison = match1 && match2
    val consolationPrizeComparison = match1 || match2

    val resultText = if (mainPrizeComparison) "Поздравляем! Вы выиграли главный приз!"
    else if (consolationPrizeComparison) "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(resultText)
}