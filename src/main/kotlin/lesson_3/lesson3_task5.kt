package org.example.lesson_3

fun main() {
    val moveString = "D2-D4;0"

    val splitedMoveString = moveString.split("-", ";")

    val from = splitedMoveString[0]
    val to = splitedMoveString[1]
    val moveNumber = splitedMoveString[2]

    println(from)
    println(to)
    println(moveNumber)
}