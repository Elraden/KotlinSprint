package org.example.lesson_22

class NewRegularBook(val name: String, val author: String)

data class NewDataBook(val name: String, val author: String)

fun main() {
    val regularBook1 = NewRegularBook("Война и мир", "Л.Н. Толстой")
    val dataBook1 = NewDataBook("Война и мир", "Л.Н. Толстой")

    println(regularBook1)
    // выводится идентификатор объекта в памяти
    println(dataBook1)
    // у data class генерируется метод toString(), который выводит свойства в читаемом виде.

}