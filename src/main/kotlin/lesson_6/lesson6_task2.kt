package org.example.lesson_6

const val MILLISECONDS_IN_SECOND = 1000
fun main() {
    println("Введите количество секунд")
    val seconds = readln().toInt()
    var counter = 0
    do {
        Thread.sleep(MILLISECONDS_IN_SECOND.toLong())
        counter++
        if (counter == seconds) {
            println("Прошло $counter секунд")
        }
    } while (counter < seconds)
}