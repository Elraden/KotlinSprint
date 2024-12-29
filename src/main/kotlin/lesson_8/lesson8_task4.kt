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

    for (ingredient in dishIngredients) println(ingredient)

    println("Какой ингредиент вы хотели бы заменить?")
    val userDishIngredient = readln()

    if (userDishIngredient !in dishIngredients) {
        println("Такого ингредиента нет в списке")
        return
    } else {
        println("Какой ингредиент вы хотели бы добавить?")
        val addIngredientAsk = readln()
        val index = dishIngredients.indexOf(userDishIngredient)
        dishIngredients[index] = addIngredientAsk
    }

    var ingredientsString = ""
    for (ingredient in dishIngredients) {
        ingredientsString += "$ingredient\n"
    }
    println("Готово! Вы сохранились следующий список:\n$ingredientsString")







}
