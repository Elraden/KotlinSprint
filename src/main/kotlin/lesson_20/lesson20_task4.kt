package org.example.lesson_20

fun main() {
    val listOfElements = listOf("Кнопка", "Ссылка", "Картинка", "Видео", "Текст")

    val actions = listOfElements.map { element ->
        { println("Нажат элемент \"$element\"") }
    }

    for ((index, action) in actions.withIndex()) {
        if ((index + 1) % 2 == 0) {
            action()
        }
    }
}