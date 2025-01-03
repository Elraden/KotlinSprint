package org.example.lesson_13

class Contacts(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactList = mutableListOf<Contacts>()
    val objectsCount = 3
    repeat(objectsCount) {
        println("Введите данные для добавления")
        println("Введите имя")
        val name = readln()
        if (name == "") {
            println("Имя не может быть пустым")
            return
        }

        println("Введите номер телефона")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона не введен")
            return
        }

        println("Введите название компании")
        val companyInput = readln()
        val company = if (companyInput == "") null else companyInput

        contactList.add(Contacts(name, phoneNumber, company))
    }

    println("Список контактов")
    contactList.forEach{contact -> contact.printContactInfo() }

}