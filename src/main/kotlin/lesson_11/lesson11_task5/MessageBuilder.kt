package org.example.lesson_11.lesson11_task5

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