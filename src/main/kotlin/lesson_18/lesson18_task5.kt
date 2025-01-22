package org.example.lesson_18

class Screen() {
    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг с координатами: x = $x, y = $y"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг с координатами: x = $x, y = $y"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисован квадрат с координатами: x = $x, y = $y"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисован квадрат с координатами: x = $x, y = $y"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисована точка с координатами: x = $x, y = $y"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисована точка с координатами: x = $x, y = $y"
    }

}

fun main() {
    val screen = Screen()

    println(screen.drawCircle(10, 20))
    println(screen.drawCircle(15.5f, 25.3f))

    println(screen.drawSquare(30, 40))
    println(screen.drawSquare(35.2f, 45.8f))

    println(screen.drawPoint(50, 60))
    println(screen.drawPoint(55.1f, 65.4f))
}