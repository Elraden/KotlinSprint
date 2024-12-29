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
    var ingredientsString = "["
    for (i in dishIngredients.indices) {
        ingredientsString += if (i != dishIngredients.size - 1) {
            "${dishIngredients[i]}, "
        } else {
            "${dishIngredients[i]}]"
        }
    }
    println(ingredientsString)

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

    var newIngredientsString = "["
    for (i in dishIngredients.indices) {
        newIngredientsString += if (i != dishIngredients.size - 1) {
            "${dishIngredients[i]}, "
        } else {
            "${dishIngredients[i]}]"
        }
    }

    println("Готово! Вы сохранили следующий список:\n$newIngredientsString")







}
