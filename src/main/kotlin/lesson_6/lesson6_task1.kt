package org.example.lesson_6

fun main() {
    println("Для начала создайте аккаунт")
    println("Введите логин:")
    val regLogin = readln()
    println("Введите пароль:")
    val regPassword = readln()
    println("Регистрация успешна. Теперь вы можете войти в ваш аккаунт")

    var isAuthorized = false

    do {
        println("Для входа введите логин")
        val authLogin = readln()
        println("Теперь введите пароль")
        val authPassword = readln()
        if (regLogin == authLogin && regPassword == authPassword) {
            isAuthorized = true
            println("Добро пожаловать")
        } else {
            println("Неверные данные. Попробуйте еще раз")
        }
    }
    while (!isAuthorized)
}