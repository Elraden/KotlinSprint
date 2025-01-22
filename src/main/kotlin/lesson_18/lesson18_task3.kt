package org.example.lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()
    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}
class Dog(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест кость")
    }
}
class Cat(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val fox = Fox("Лисичка Маша")
    val dog = Dog("Собака Шарик")
    val cat = Cat("Кошка Мурка")

    val listOfAnimals: List<Animal> = listOf(fox, dog, cat)

    listOfAnimals.forEach {
        it.eat()
        it.sleep()
        println()
    }
}