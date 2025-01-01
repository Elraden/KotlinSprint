package org.example.lesson_11.lesson11_task1

fun main() {
    val user1 = User(1, "Ray", "hello123", "qwerty@qwerty.ru")
    val user2 = User(2, "Noname", "123456", "qwerty123@qwerty.ru")

    println("ID: ${user1.id}\nЛогин: ${user1.login}\nПароль: ${user1.password}\nE-mail: ${user1.email}")
    println()
    println("ID: ${user2.id}\nЛогин: ${user2.login}\nПароль: ${user2.password}\nE-mail: ${user2.email}")

}