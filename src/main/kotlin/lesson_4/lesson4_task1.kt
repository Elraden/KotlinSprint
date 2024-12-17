package org.example.lesson_4

fun main() {
    val totalTables = 13
    val bookedToday = 13
    val bookedTomorrow = 9

    println("Доступность столиков на сегодня ${bookedToday < totalTables} ")
    println("Доступность столиков на завтра ${bookedTomorrow < totalTables}")
}