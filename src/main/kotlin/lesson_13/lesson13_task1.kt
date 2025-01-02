package org.example.lesson_13

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    val company: String?
) { }

fun main() {
    val phoneBook = PhoneBook("Иван Иванов", 79119021443, "Company1")
    val phoneBook2 = PhoneBook("Петр Николаев", 79760265143, null)
}