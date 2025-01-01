package org.example.lesson_10

const val MIN_LENGTH = 4
fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    val message = validateLength(userLogin, userPassword)
    println(message)
}

fun validateLength(login: String, password: String): String {
    return if (login.length < MIN_LENGTH || password.length < MIN_LENGTH) {
        "Логин или пароль недостаточно длинные"
    } else {
        "Добро пожаловать"
    }
}