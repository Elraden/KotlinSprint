package org.example.lesson_16

class User(
    private val login: String,
    private val password: String
) {
    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user = User("admin", "password")

    val inputPassword = "password"
    val isValidPassword = user.validatePassword(inputPassword)
    println("Пароль введен верно: $isValidPassword")
}