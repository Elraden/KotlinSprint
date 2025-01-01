package org.example.lesson_11.lesson11_task4

class Recipe(
    val cover: String,
    val title: String,
    val servingsQuantity: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
    var isFavourite: Boolean = false,
) { }