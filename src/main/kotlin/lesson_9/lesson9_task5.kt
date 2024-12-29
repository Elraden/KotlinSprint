package org.example.lesson_9

fun main() {
    val uniqueIngredients = mutableSetOf<String>()
    while (uniqueIngredients.size < 5) {
        val inputIngredient = readln().lowercase()
        if (!uniqueIngredients.add(inputIngredient)) {
            println("Ингредиент $inputIngredient уже был добавлен. Добавьте другой")
        }
    }

    val sortedUniqueIngredients = uniqueIngredients.sorted()

    val newSortedUniqueIngredients = sortedUniqueIngredients.mapIndexed{i, ingr ->
        if (i == 0) ingr.replaceFirstChar { char -> char.uppercase() }
        else ingr
    }

    println(newSortedUniqueIngredients.joinToString(", "))
}