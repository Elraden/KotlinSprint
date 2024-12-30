package org.example.lesson_9

fun main() {
    val ingredientsList = mutableListOf("Молоко", "Мука", "Сахар")
    println("В рецепте есть базовые игредиенты: $ingredientsList")
    println("Желаете добавить еще?")
    val userAnswer = readln()
    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredientAnswer = readln()
        ingredientsList.add(userIngredientAnswer)
    } else {
        return
    }
    println(ingredientsList)

}