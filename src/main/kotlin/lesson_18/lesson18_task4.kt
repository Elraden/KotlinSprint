package org.example.lesson_18

import kotlin.math.pow

abstract class Box() {
    abstract fun calculateBoxSquare(): Double
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
): Box() {
    override fun calculateBoxSquare(): Double {
        return 2.0 * (length * width + length * height + width * height)
    }
}

class CubeBox(private val edgeLength: Double): Box() {
    override fun calculateBoxSquare(): Double {
        return 6 * edgeLength.pow(2)
    }
}

fun main() {
    val rectangularBox: Box = RectangularBox(10.1, 4.6, 7.3)
    val cubeBox: Box = CubeBox(10.7)

    val listOfBoxes: List<Box> = listOf(rectangularBox, cubeBox)
    listOfBoxes.forEach { box ->
        println("Площадь коробки: ${"%.2f".format(box.calculateBoxSquare())}")
        println()
    }
}