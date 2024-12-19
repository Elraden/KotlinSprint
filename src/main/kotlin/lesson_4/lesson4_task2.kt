package org.example.lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    val weight1 = 20
    val volume1 = 80

    println("Average: ${weight1 > minWeight && weight1 <= maxWeight && volume1 < maxVolume}")

    val weight2 = 50
    val volume2 = 100

    println("Average: ${weight2 > minWeight && weight2 <= maxWeight && volume2 < maxVolume}")
}