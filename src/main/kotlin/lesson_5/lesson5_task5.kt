package org.example.lesson_5

fun main() {
    val rangeNumbers = 0..42
    val randomNumber1 = rangeNumbers.random()
    val randomNumber2 = rangeNumbers.random()
    val randomNumber3 = rangeNumbers.random()

    val winningNumbers = listOf(randomNumber1, randomNumber2, randomNumber3)

    println("Введите первое число от 0 до 42")
    val userNumber1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val userNumber2 = readln().toInt()

    println("Введите третье число от 0 до 42")
    val userNumber3 = readln().toInt()

    val userNumbers = listOf(userNumber1, userNumber2, userNumber3)

    val matches = winningNumbers.intersect(userNumbers).size

    val result = when(matches) {
        3 -> "Вы угадали все числа и выиграли джекпот!"
        2 -> "Вы угадали 2 числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз"
        else -> "Вы не угадали ни одного числа"
    }
    println(result)
    println("Выигрышные числа: ${winningNumbers[0]}, ${winningNumbers[1]}, ${winningNumbers[2]}")
}