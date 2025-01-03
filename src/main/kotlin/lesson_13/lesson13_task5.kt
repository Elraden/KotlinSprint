package org.example.lesson_13

class ContactsBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    try {
        println("Введите имя")
        val name = readln()

        println("Введите номер телефона")
        val phoneNumber = readln().toLong()

        println("Введите название компании")
        val companyInput = readln()
        val company = if (companyInput == "") null else companyInput


        val contact = ContactsBook(name, phoneNumber, company)
        println("\nСозданный контакт:")
        contact.printContactInfo()
    } catch (e: NumberFormatException) {
        println("Ошибка: номер телефона должен содержать только цифры")
    }


}