package org.example.lesson_8

fun main() {
    val ingredients = arrayOf(
            "Спагетти",
            "Яичные желтки",
            "Пармезан",
            "Бекон",
            "Чеснок",
            "Оливковое масло",
            "Соль",
            "Чёрный перец"
        )

    println("Какой ингредиент вас интересует?")
    val userIngredient = readln()
    var found = false
    for (ingredient in ingredients) {
        if (userIngredient == ingredient) {
            println("Ингредиент \"$userIngredient\" в рецепте есть")
            found = true
            break
        }
    }
    if (!found) {
        println("Такого ингредиента в рецепте нет")
    }
}