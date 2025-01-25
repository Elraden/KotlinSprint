package org.example.lesson_22

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("Война и мир", "Л.Н. Толстой")
    val regularBook2 = RegularBook("Война и мир", "Л.Н. Толстой")
    println(regularBook1 == regularBook2)
    // сравниваются ссылки на объекты, разные объекты в памяти, поэтому false

    val dataBook1 = DataBook("Война и мир", "Л.Н. Толстой")
    val dataBook2 = DataBook("Война и мир", "Л.Н. Толстой")
    println(dataBook1 == dataBook2)
    // сравниваются свойства объектов, поэтому true
}