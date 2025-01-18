package org.example.lesson_11

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

class User(
    val avatar: String,
    val name: String,
    var status: String = "микрофон выключен"
) { }


fun main() {
    val room = Room("img.jpg", "Комната 1")
    room.addUser(User("avatar.jpg", "Alex"))
    room.addUser(User("avatar2.jpg", "Mike", "пользователь заглушен"))
}