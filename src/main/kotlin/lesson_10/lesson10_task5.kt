package org.example.lesson_10

const val LOGIN = "admin"
const val PASSWORD = "admin123"

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()
    val token = auth(login, password)
    println(getShopBasket(token))
}

fun auth(login: String, password: String): String? {
    return if (login == LOGIN && password == PASSWORD) generateToken()
    else null
}

fun generateToken(): String {
    val numbers = ('1'..'9').joinToString("")
    val lowerChars = ('a'..'z').joinToString("")
    val upperChars = ('A'..'Z').joinToString("")
    val fullSymbolsString = numbers + lowerChars + upperChars
    return (1..32).map { fullSymbolsString.random() }.joinToString("")
}

fun getShopBasket(token: String?): Any {
    val basket = listOf("Молоко", "Кофе", "Конфеты")
    return if (token != null) "Ваши товары: ${basket.joinToString(", ", prefix = "[", postfix = "]")}"
    else "Неудачная авторизация"
}