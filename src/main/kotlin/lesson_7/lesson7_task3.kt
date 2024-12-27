package org.example.lesson_7

fun main() {
    val startProgression = 0
    println("Введите число")
    val endProgression = readln().toInt()
    val progressionStep = 2
    println("Четные числа от $startProgression до $endProgression")
    for (i in startProgression..endProgression step progressionStep) {
        println(i)
    }
}