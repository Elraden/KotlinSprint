package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    private val radius: Double
) {
    fun calculateLength(): Double {
        return 2 * PI * radius
    }

    fun calculateSquare(): Double {
        return PI * radius.pow(2)
    }
}

fun main() {
    val circle = Circle(13.4)
    val circleLength = circle.calculateLength()
    val circleSquare = circle.calculateSquare()

    println("Длина окружности: $circleLength")
    println("Площадь круга: $circleSquare")
}