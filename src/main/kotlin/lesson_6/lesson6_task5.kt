package org.example.lesson_6

fun main() {
    var triesNumber = 3
    println("Докажите, что вы не бот")
    var number1 = (1..9).random()
    var number2 = (1..9).random()
    while (triesNumber > 0) {
        println("Решите простой математический пример")
        val sum = number1 + number2
        println("$number1 + $number2 = ?")
        val userAnswer = readln().toInt()
        if (userAnswer == sum) {
            println("Вы не бот. Добро пожаловать")
            break
        } else {
            triesNumber--
            println("Ответ неверный. Осталось попыток: $triesNumber")
            if (triesNumber != 0) {
                number1 = (1..9).random()
                number2 = (1..9).random()
            } else {
                println("Доступ запрещен")
            }
        }
    }
}