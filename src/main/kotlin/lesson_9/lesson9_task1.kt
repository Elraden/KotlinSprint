package org.example.lesson_9

fun main() {
    val ingredientsList = listOf(
        "Спагетти",
        "Яичные желтки",
        "Пармезан",
        "Гуанчале",
        "Чеснок",
        "Оливковое масло",
        "Соль",
        "Чёрный перец"
    )

    println("В рецепте есть следующие ингредиенты: $ingredientsList")

    println("Ингредиенты по одному:")
    ingredientsList.forEach { ingredient ->
        println(ingredient)
    }
}