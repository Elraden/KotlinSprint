package org.example.lesson_15

abstract class User(
    val name: String,
    ) {
    protected var message: String = ""

    fun readForum() {
        println("$name читает форум")
    }

    fun writeMessage(newMessage: String) {
        message = newMessage
        println("$name пишет сообщение: \"$message\"")
    }
}

class RegularUser(name: String) : User(name)

class Administrator(name: String): User(name) {
    fun deleteMessage(messageId: Int) {
        println("Сообщение \"$message\" c id $messageId успешно удалено")
    }

    fun deleteUser(userName: String) {
        println("$name удаляет пользователя $userName")
    }
}

fun main() {
    val regularUser = RegularUser("Максим")
    val administrator = Administrator("Инга")

    regularUser.readForum()
    regularUser.writeMessage("Привет всем")

    administrator.readForum()
    administrator.writeMessage("Я администратор. Доброго дня всем")
    administrator.deleteUser("Alex534")
    administrator.deleteMessage(123)
}