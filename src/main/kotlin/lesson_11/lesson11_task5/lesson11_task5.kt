package org.example.lesson_11.lesson11_task5

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Сергей")
    val user2 = forum.createNewUser("Маша")

    forum.createNewMessage(user1.userId, "Привет. Это мое первое сообщение")
    forum.createNewMessage(user1.userId, "Как дела?")

    forum.createNewMessage(user2.userId, "Всем привет. Как дела?")
    forum.createNewMessage(user2.userId, "Очень рада быть здесь")

    forum.printThread()

}