package org.example.lesson_11.lesson11_task5

class Forum {
    val members = mutableListOf<ForumMember>()
    val messages = mutableListOf<ForumMessage>()
    var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
        return MemberBuilder(this)
            .setUserName(userName)
            .create()
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        return MessageBuilder(this)
            .setAuthorId(authorId)
            .setMessage(message)
            .create()
    }

    fun printThread() {
        for (message in messages) {
            val author = members.find {member -> member.userId == message.authorId}
            val authorName = author?.userName
            println("$authorName: ${message.message}")
        }
    }
}