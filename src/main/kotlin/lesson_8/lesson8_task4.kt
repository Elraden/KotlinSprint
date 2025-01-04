package org.example.lesson_8

fun main() {
    val dishIngredients = arrayOf(
        "Спагетти",
        "Яичные желтки",
        "Пармезан",
        "Бекон",
        "Чеснок",
        "Оливковое масло",
        "Соль",
        "Чёрный перец"
    )

    println("Список ингредиентов:")
    val ingredientsString = dishIngredients.joinToString(separator = ", ", prefix = "[", postfix = "]")
    println(ingredientsString)

    println("Какой ингредиент вы хотели бы заменить?")
    val userDishIngredient = readln()

    val ingredientIndex = dishIngredients.indexOf(userDishIngredient)
    if (ingredientIndex == -1) {
        println("Такого ингредиента нет в списке")
        return
    }

    println("Какой ингредиент вы хотели бы добавить?")
    val newIngredient = readln()
    dishIngredients[ingredientIndex] = newIngredient

    val newIngredientsString = dishIngredients.joinToString(separator = ", ", prefix = "[", postfix = "]")

    println("Готово! Вы сохранили следующий список:\n$newIngredientsString")







}
