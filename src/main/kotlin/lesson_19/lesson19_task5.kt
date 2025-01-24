package org.example.lesson_19


enum class Gender(val title: String) {
    MAN("Мужской"),
    WOMAN("Женский")
}
class Human(private val name: String, private val gender: Gender) {
    fun showHumanInfo() {
        println("Имя: $name, Пол: ${gender.title}")
    }
}

fun main() {
    val peoplesCount = 5
    val cardStorage = mutableListOf<Human>()

    println("Введите имя и пол человека в формате: м - мужской, ж - женский")

    while (cardStorage.size < peoplesCount) {
        println("Введите имя")
        val name = readln().trim()
        if (name.isEmpty()) {
            println("Имя не может быть пустым. Введите имя снова")
            continue
        }
        println("Введите пол (м/ж): ")
        val userGender = readln().trim().lowercase()
        val gender = when (userGender) {
            "м" -> Gender.MAN
            "ж" -> Gender.WOMAN
            else -> {
                println("Неправильно указан пол. Введите еще раз")
                continue
            }
        }
        cardStorage.add(Human(name, gender))
        println("Человек успешно добавлен. Осталось: ${peoplesCount - cardStorage.size}")
    }

    println("Список добавленных людей:")
    cardStorage.forEach { it.showHumanInfo() }
}

