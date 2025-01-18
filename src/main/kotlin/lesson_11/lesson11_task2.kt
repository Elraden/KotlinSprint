package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {

    fun printInfo() {
        println("ID: $id\nЛогин: $login\nПароль: $password\nE-mail: $email\nБиография: $bio")
    }

    fun addBiography() {
        println("Введите информацию \"О себе\"")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль успешно изменен")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = User2(1, "Ray", "password", "ray@gmail.com")

    user.addBiography()
    user.changePassword()
    user.printInfo()

}