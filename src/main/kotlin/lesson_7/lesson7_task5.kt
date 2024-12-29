package org.example.lesson_7

fun main() {
    println("Введите длину пароля (не менее 6 символов)")
    val userPasswordLength = readln().toInt()
    if (userPasswordLength >= 6) {
        val digits = '0'..'9'
        val lowerCase = 'a'..'z'
        val upperCase = 'A'..'Z'
        val allCharacters = digits + lowerCase + upperCase

        var randomPasswordString = ""
        var hasDigit = false
        var hasLowerCase = false
        var hasUpperCase = false

        for (i in 1..userPasswordLength - 2) {
            val char = allCharacters.random()
            randomPasswordString += char

            if (char in digits) hasDigit = true
            if (char in lowerCase) hasLowerCase = true
            if (char in upperCase) hasUpperCase = true
        }

        randomPasswordString += if (!hasDigit) digits.random()
        else if (!hasLowerCase) lowerCase.random()
        else if (!hasUpperCase) upperCase.random()
        else allCharacters.random()

        randomPasswordString += allCharacters.random()

        println("Ваш пароль: $randomPasswordString")
    } else {
        println("Длина пароля должна быть не менее 6 символов")
    }
}