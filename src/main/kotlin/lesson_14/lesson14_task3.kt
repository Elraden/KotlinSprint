package org.example.lesson_14

import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun calculateSquare(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val raduis: Double,
): Figure(color) {
    override fun calculateSquare(): Double {
        return Math.PI * raduis.pow(2)
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * raduis
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val width: Double
): Figure(color) {
    override fun calculateSquare(): Double {
        return height * width
    }

    override fun calculatePerimeter(): Double {
        return 2 * (height + width)
    }
}

fun main() {
    val circle1 = Circle("black", 5.2)
    val circle2 = Circle("white", 10.7)
    val circle3 = Circle("white", 3.1)

    val rectangle1 = Rectangle("black", 10.0, 5.5)
    val rectangle2 = Rectangle("white", 3.6, 10.3)
    val rectangle3 = Rectangle("black", 74.9, 3.1)

    val figures = listOf(circle1, circle2, circle3, rectangle1, rectangle2, rectangle3)
    val perimetersSumBlack = figures.filter { it.color == "black" }.sumOf { it.calculatePerimeter() }
    val squareSumWhite = figures.filter { it.color == "white" }.sumOf { it.calculateSquare() }

    println("Сумма периметров черных фигур: $perimetersSumBlack")
    println("Сумма площадей белых фигур: $squareSumWhite")
}