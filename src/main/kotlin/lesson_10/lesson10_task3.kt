package org.example.lesson_10

fun main() {
    println("Введите длину пароля")
    val userPasswordLength = readln().toInt()
    val randomPassword = generatePassword(userPasswordLength)
    println(randomPassword)
}

fun generatePassword(length: Int): String {
    var passwordString = ""
    for (i in 1..length) {
        val randomNumber = (1..9).random()
        val randomSymbol = " !\"#\$%&'()*+,-./".random()
        if (i % 2 == 1) {
            passwordString += randomNumber
        } else {
            passwordString += randomSymbol
        }
    }
    return passwordString
}