package org.example.lesson_11

class Ingredient(
    val name: String,
    val quantity: Double,
    val measureUnit: String,
) { }

class Recipe(
    val cover: String,
    val title: String,
    val servingsQuantity: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
    var isFavourite: Boolean = false,
) { }

class RecipeCategory(
    val cover: String,
    val title: String,
    val recipes: List<Recipe>
) { }