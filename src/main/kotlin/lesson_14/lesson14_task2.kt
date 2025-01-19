package org.example.lesson_14

open class Liner(
    open val name: String,
    open val speed: Int = 50,
    open val capacity: Int = 5000,
) {
    open fun loadCargo() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }
    fun printInfo() {
        println("Название: $name, Скорость: $speed узлов, Вместимость: $capacity пассажиров")
    }
}

class Cargo(
    override val name: String,
    override val speed: Int = 30,
    override val capacity: Int = 7000
): Liner(name, speed, capacity) {
    override fun loadCargo() {
        println("$name активирует погрузочный кран")
    }
}

class IceBreaker(
    override val name: String,
    override val speed: Int = 20,
    override val capacity: Int = 3000
): Liner(name, speed, capacity) {
    fun breakIce() {
        println("\"$name\" начал колоть лёд")
    }

    override fun loadCargo() {
        println("$name открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner("Лайнер")
    liner.printInfo()
    liner.loadCargo()

    println()

    val cargo = Cargo("Грузовой")
    cargo.printInfo()
    cargo.loadCargo()

    println()

    val iceBreaker = IceBreaker("Ледокол")
    iceBreaker.printInfo()
    iceBreaker.breakIce()
    iceBreaker.loadCargo()
}