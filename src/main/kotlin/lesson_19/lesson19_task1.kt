package org.example.lesson_19

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {
    val fishes = Fish.entries
    println("Вы можете добавить следующих рыб в свой аквариум:")
    fishes.forEach { fish ->
        println(fish.title)
    }
}
