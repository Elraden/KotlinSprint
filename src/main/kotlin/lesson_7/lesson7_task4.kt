package org.example.lesson_7

fun main() {
    println("Введите количество секунд")
    val endSeconds = readln().toInt()
    for (i in endSeconds downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
        if (i == 1) println("Время вышло")
    }
}