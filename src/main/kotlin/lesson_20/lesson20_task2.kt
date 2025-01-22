package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
) {
    fun showStats() {
        println("Имя: $name, Текущее здоровье: $currentHealth, Максимальное здоровье: $maxHealth")
    }
}

fun main() {

    val useHealPotion: (Player) -> Unit = { player ->
        if (player.currentHealth < player.maxHealth) {
            println("${player.name} выпивает лечебное зелье")
            player.currentHealth = player.maxHealth
        } else {
            println("${player.name} полностью здоров и не нуждается в лечении")
        }
    }

    val player = Player("Elraden", 56, 100)

    player.showStats()
    useHealPotion(player)
    player.showStats()
    useHealPotion(player)
}