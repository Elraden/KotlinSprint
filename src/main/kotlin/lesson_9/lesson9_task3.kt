package org.example.lesson_9

fun main() {
    val ingredientsCountList = mutableListOf(2, 50, 15)
    println("Сколько порций вам нужно?")
    val ingredientsCount = readln().toInt()
    for (i in ingredientsCountList.indices) {
        ingredientsCountList[i] *= ingredientsCount
    }

    println("На $ingredientsCount порций вам понадобится:")
    println("Яиц – ${ingredientsCountList[0]} шт")
    println("Молока – ${ingredientsCountList[1]} мл")
    println("Сливочного масла – ${ingredientsCountList[2]} гр")
}