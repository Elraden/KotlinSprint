package org.example.lesson_2

fun main() {
    val studentsQuantity = 4
    val student1Score = 3
    val student2Score = 4
    val student3Score = 3
    val student4Score = 5

    val meanScore = (student1Score + student2Score + student3Score + student4Score) / studentsQuantity.toFloat()
    println(meanScore)
}