package org.example.lesson_7

fun main() {
    println("Введите количество секунд")
    val endSeconds = readln().toInt()
    for (i in endSeconds downTo 0) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
        if (i == 0) println("Время вышло")
    }
}