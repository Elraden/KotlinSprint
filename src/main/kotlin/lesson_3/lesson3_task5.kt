package org.example.lesson_3

fun main() {
    val moveString = "D2-D4;0"
    val from = moveString.substring(0,2)
    val to = moveString.substring(3,5)
    val moveNumber = moveString.substring(6,7)

    println(from)
    println(to)
    println(moveNumber)
}