package org.example.lesson_11.lesson11_task3

class Room(
    val cover: String,
    val title: String,
) {
    val usersList = mutableListOf<User>()

    fun addUser(user: User) {
        usersList.add(user)
    }

    fun updateStatus(username: String, newStatus: String): String {
        val user = usersList.find{ user -> user.name == username }
        return if (user != null) {
            user.status = newStatus
            "Статус пользователя $username успешно обновлен"
        } else {
            "Пользователя с $username не существует"
        }
    }
}

