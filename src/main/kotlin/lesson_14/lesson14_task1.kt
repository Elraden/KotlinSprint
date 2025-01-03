package org.example.lesson_14

open class LinerShip(
    val name: String,
    val speed: Int = 50,
    val capacity: Int = 5000,
    ) {
    fun printInfo() {
        println("Название: $name, Скорость: $speed узлов, Вместимость: $capacity пассажиров")
    }
}

class CargoShip(
    name: String,
    speed: Int = 30,
    capacity: Int = 7000
): LinerShip(name, speed, capacity) { }

class IceBreakerShip(
    name: String,
    speed: Int = 20,
    capacity: Int = 3000
): LinerShip(name, speed, capacity) {
    fun breakIce() {
        println("\"$name\" начал колоть лёд")
    }
}

fun main() {
    val liner = LinerShip("Лайнер")
    liner.printInfo()

    println()

    val cargo = CargoShip("Грузовой")
    cargo.printInfo()

    println()

    val iceBreaker = IceBreakerShip("Ледокол")
    iceBreaker.printInfo()
    iceBreaker.breakIce()
}