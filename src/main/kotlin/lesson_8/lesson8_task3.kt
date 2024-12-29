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

    if (userIngredient in ingredients) {
        println("Ингредиент \"$userIngredient\" в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}