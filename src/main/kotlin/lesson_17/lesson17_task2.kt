package org.example.lesson_17

class Ship(name: String, val averageSpeed: Int, val port: String) {
    var name: String = name
        set(value) {
            println("Имя корабля менять нельзя")
        }
}

fun main() {
    val ship = Ship("Навуходоносор", 100, "Космический порт № 1")
    ship.name = "Стремительный"
    println(ship.name)
}