package org.example.lesson_7

fun main() {
    println("Введите длину пароля (не менее 6 символов)")
    val userPasswordLength = readln().toInt()
    if (userPasswordLength >= 6) {
        var randomPasswordString: String;
        val digits = '0'..'9'
        val lowerCase = 'a'..'z'
        val upperCase = 'A'..'Z'
        val allCharacters = digits + lowerCase + upperCase
        var hasDigit: Boolean
        var hasLowerCase: Boolean
        var hasUpperCase: Boolean

        do {
            randomPasswordString = ""
            for (i in 1..userPasswordLength) {
                randomPasswordString += allCharacters.random()
            }

            hasDigit = false
            hasUpperCase = false
            hasLowerCase = false

            for (char in randomPasswordString) {
                if (char in digits) hasDigit = true
                if (char in lowerCase) hasLowerCase = true
                if (char in upperCase) hasUpperCase = true
                if (hasDigit && hasLowerCase && hasUpperCase) break
            }
        } while (!(hasDigit && hasLowerCase && hasUpperCase))
        println("Ваш пароль: $randomPasswordString")
    } else {
        println("Длина пароля должна быть не менее 6 символов")
    }
}