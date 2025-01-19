package org.example.lesson_16

class Player(val name: String, private var health: Int, private var attackPower: Int) {

    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            println("$name получает $damage урона. Здоровье: $health")
            if (health <= 0) {
                die()
            }
        }
    }

    fun heal(healing: Int) {
        if (health > 0) {
            health += healing
            println("$name вылечился на $healing здоровья. Здоровье: $health")
        } else {
            println("$name погиб. Мертвых не вылечить...")
        }
    }

    private fun die() {
        attackPower = 0
        health = 0
        println("Ранение оказалось смертельным. $name погибает")
    }
}

fun main() {
    val player = Player("Elraden", 100, 10)
    player.takeDamage(30)
    player.heal(5)
    player.takeDamage(50)
    player.heal(30)
    player.takeDamage(55)
    player.heal(10)

}