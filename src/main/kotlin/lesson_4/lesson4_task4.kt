package org.example.lesson_4

fun main() {
    var trainingDay = 5

    val isEvenDay = trainingDay % 2 == 0

    val arms = !isEvenDay
    val abs = !isEvenDay
    val legs = isEvenDay
    val back = isEvenDay

    println("""
        Упражнения для рук: $arms
        Упражнения для ног: $legs
        Упражнения для спины: $back
        Упражнения для пресса: $abs
    """.trimIndent())
}