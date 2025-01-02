package org.example.lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
) { }

class ForumMessage(
    val authorId: Int,
    val message: String,
) { }

class MemberBuilder(
    private val forum: Forum) {
    private var userName: String = ""

    fun setUserName(name: String): MemberBuilder {
        userName = name
        return this
    }

    fun create(): ForumMember {
        val user = ForumMember(forum.userIdCounter++, userName)
        forum.members.add(user)
        return user
    }
}

class MessageBuilder(private val forum: Forum) {
    private var authorId: Int = -1
    private var message: String = ""

    fun setAuthorId(id: Int): MessageBuilder {
        authorId = id
        return this
    }

    fun setMessage(content: String): MessageBuilder {
        message = content
        return this
    }

    fun create(): ForumMessage? {
        val authorExists = forum.members.any {member -> member.userId == authorId}
        if (!authorExists) {
            println("Пользователь с id $authorId не найден")
            return null
        }
        val forumMessage = ForumMessage(authorId, message)
        forum.messages.add(forumMessage)
        return forumMessage
    }
}

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