package org.example.lesson_7

fun main() {
    val passwordLength = 6
    var passwordString = "";
    for (i in 1..passwordLength) {
        if (i % 2 == 0) {
            val randomNumber = (0..9).random()
            passwordString += randomNumber
        } else {
            val randomChar = ('a'..'z').random()
            passwordString += randomChar
        }
    }
    println(passwordString)
}