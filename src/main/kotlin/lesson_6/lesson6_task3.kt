package org.example.lesson_6

const val MILLISECONDS_IN_SECOND = 1000
fun main() {
    println("Введите количество секунд")
    var seconds = readln().toInt()
    while(seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(MILLISECONDS_IN_SECOND.toLong())
        seconds--
        if (seconds == 0) {
            println("Время вышло")
        }
    }
}