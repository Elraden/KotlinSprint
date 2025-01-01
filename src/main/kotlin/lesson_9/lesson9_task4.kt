package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов через запятую с пробелом")
    val userIngredients = readln()
    val splitAndSortedIngredients = userIngredients.split(", ").sorted()
    println(splitAndSortedIngredients)
}