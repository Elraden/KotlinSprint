package org.example.lesson_7

fun main() {
    var randomAuthCode = (1000..9999).random()
    while (true) {
        println("Ваш код авторизации: $randomAuthCode")
        println("Введите код авторизации")
        val userAuthCode = readln().toInt()
        if (userAuthCode == randomAuthCode) {
            println("Добро пожаловать")
            break
        } else {
            println("Вы ввели неверный код. Попробуйте еще раз")
            randomAuthCode = (1000..9999).random()
        }
    }
}