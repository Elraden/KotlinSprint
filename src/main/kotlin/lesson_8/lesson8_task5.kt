package org.example.lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов")
    val ingredientsCount = readln().toInt()
    val ingredientsArray = Array(ingredientsCount) { "" }
    for (i in ingredientsArray.indices) {
        println("Введите название ингредиента")
        val userIngredient = readln()
        ingredientsArray[i] = userIngredient
    }

    var finalString = "["
    for (i in ingredientsArray.indices) {
        if (i != ingredientsArray.size - 1) {
            finalString += "${ingredientsArray[i]}, "
        } else {
            finalString += "${ingredientsArray[i]}]"
        }
    }

    println(finalString)
}