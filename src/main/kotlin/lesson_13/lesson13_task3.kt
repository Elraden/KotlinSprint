package org.example.lesson_13

class PhoneDictionary(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = listOf(
        PhoneDictionary("Ростислав", 89123456789, "Reddit"),
        PhoneDictionary("Иван",  89345678901, "Google"),
        PhoneDictionary("Алексей", 89231234567),
        PhoneDictionary("Мария", 89012345678),
        PhoneDictionary("Ольга", 89098765432, "null"),
    )
    val realCompanies = contacts.filter{company -> company.company != "null" && company.company != null }

    println("Список компаний:")
    realCompanies.forEach{ company -> println(company.company)}
}

