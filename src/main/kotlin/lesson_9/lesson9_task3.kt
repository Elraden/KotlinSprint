package org.example.lesson_9

fun main() {
    val ingredientsCountList = mutableListOf(2, 50, 15)
    println("Сколько порций вам нужно?")
    val ingredientsCount = readln().toInt()
    val newIngredientsCountList = ingredientsCountList.map{item -> item * ingredientsCount}

    println("На $ingredientsCount порций вам понадобится:")
    println("Яиц – ${newIngredientsCountList[0]} шт")
    println("Молока – ${newIngredientsCountList[1]} мл")
    println("Сливочного масла – ${newIngredientsCountList[2]} гр")
}