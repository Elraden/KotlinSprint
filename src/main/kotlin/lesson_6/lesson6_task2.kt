package org.example.lesson_6

private const val MILLISECONDS_IN_SECOND = 1000
fun main() {
    println("Введите количество секунд")
    val seconds = readln().toLong()
    val secondsToMilliseconds = seconds * MILLISECONDS_IN_SECOND
    Thread.sleep(secondsToMilliseconds)
    println("Прошло $seconds секунд")
}