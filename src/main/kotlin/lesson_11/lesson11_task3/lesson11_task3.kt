package org.example.lesson_11.lesson11_task3

fun main() {
    val room = Room("img.jpg", "Комната 1")
    room.addUser(User("avatar.jpg", "Alex"))
    room.addUser(User("avatar2.jpg", "Mike", "пользователь заглушен"))
}