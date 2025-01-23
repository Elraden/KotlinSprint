package org.example.lesson_19

enum class Ammo(val title: String, val damage: Int) {
    BLUE("Синий", 5),
    GREEN("Зеленый", 10),
    RED("Красный", 20),
}

class Tank() {

    private var currentAmmo: Ammo? = null

    fun loadNewShell(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен боеприпасом типа \"${ammo.title}\"")
    }

    fun shoot() {
        if (currentAmmo == null) {
            println("Танк не заряжен")
        } else {
            println("Произведен выстрел. Нанесено урона: ${currentAmmo!!.damage}")
            currentAmmo = null
        }
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()

    tank.loadNewShell(Ammo.RED)
    tank.shoot()

    tank.loadNewShell(Ammo.GREEN)
    tank.shoot()

    tank.shoot()
}