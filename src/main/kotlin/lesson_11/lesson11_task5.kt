package org.example.lesson_11

class ForumMember(val userId: Int, val userName: String) { }

class ForumMessage(val authorId: Int, val message: String, ) { }

class Forum {
    val members = mutableListOf<ForumMember>()
    val messages = mutableListOf<ForumMessage>()
    var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
        val user = ForumMember(userIdCounter++, userName)
        members.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val authorExists = members.any {member -> member.userId == authorId}
        if (!authorExists) {
            println("Пользователь с id $authorId не найден")
            return null
        }
        val forumMessage = ForumMessage(authorId, message)
        messages.add(forumMessage)
        return forumMessage
    }

    fun printThread() {
        for (message in messages) {
            val author = members.find {member -> member.userId == message.authorId}
            val authorName = author?.userName
            println("$authorName: ${message.message}")
        }
    }
}

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