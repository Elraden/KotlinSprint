package org.example.lesson_20

class GamePlayer(val hasKey: Boolean)

fun main() {
    val player = GamePlayer(true)
    val player1 = GamePlayer(false)

    val doorAction: (GamePlayer) -> String = { p ->
        if (p.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    println(doorAction(player))
    println(doorAction(player1))
}