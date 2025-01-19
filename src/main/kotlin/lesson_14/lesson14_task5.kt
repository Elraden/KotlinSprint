package org.example.lesson_14


open class Message(
    val id: Int,
    val text: String,
    val author: String,
) { }

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int,
): Message(id, text, author) { }

class Chat() {
    val messages = mutableListOf<Message>()
    var messageIdCounter = 1

    fun addMessage(text: String, author: String) {
        messages.add(Message(messageIdCounter++, text, author))
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        if (messages.none{ message -> message.id == parentMessageId }) {
            println("Сообщения с id $parentMessageId не найдено")
            return
        }
        messages.add(ChildMessage(messageIdCounter++, text, author, parentMessageId))
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            if (message is ChildMessage) message.parentMessageId else message.id
        }

        for ((parentId, group) in groupedMessages) {
            val parentMessage = group.find { message -> message.id == parentId && message !is ChildMessage }
            if (parentMessage != null) {
                println("${parentMessage.author}: ${parentMessage.text}")
                group.filterIsInstance<ChildMessage>().forEach { child ->
                    println("\t${child.author}: ${child.text}")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Привет всем. Как настроение?", "Сергей")
    chat.addMessage("Добрый день всем", "Мария")

    chat.addThreadMessage(1, "Все отлично. Как ваши праздники?", "Мария")
    chat.addThreadMessage(1, "Лучше не бывает", "Сергей")
    chat.addThreadMessage(2, "Добрый день, Мария. Как ваши дела?", "Сергей")


    chat.printChat()
}