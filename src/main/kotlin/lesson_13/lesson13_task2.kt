package org.example.lesson_13

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = PhoneContact("Иван Иванов", 79119021443, "Reddit")
    val phoneBook2 = PhoneContact("Петр Николаев", 79760265143)

    phoneBook.printContactInfo()
    phoneBook2.printContactInfo()

}