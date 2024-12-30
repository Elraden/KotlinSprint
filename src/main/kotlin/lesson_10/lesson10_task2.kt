package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль")
    val userPassword = readln()

    val message = validateLength(userLogin, userPassword)
    println(message)
}

fun validateLength(login: String, password: String): String {
    return if (login.length < 4 || password.length < 4) {
        "Логин или пароль недостаточно длинные"
    } else {
        "Добро пожаловать"
    }
}