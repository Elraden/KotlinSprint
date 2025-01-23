package org.example.lesson_17

class User(userLogin: String, userPassword: String) {
    var login: String = userLogin
        set(value) {
            field = value
            println("Логин успешно изменен")
        }

    var password: String = userPassword
        get() = "*".repeat(field.length)

        set(value) {
            println("Вы не можете изменять пароль")
        }
}

fun main() {
    val user = User("Elcora", "password123")

    user.password = "new password"
    println("Пароль: ${user.password}")

    println("Логин: ${user.login}")
    user.login = "new login"
    println("Новый логин: ${user.login}")
}