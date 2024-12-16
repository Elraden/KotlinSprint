package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 10

    val buff = 20
    val crystalOreWithBuff = crystalOre + (crystalOre * (buff / 100f))
    val ironOreWithBuff = ironOre + (ironOre * (buff / 100f))

    println("Кристальная руда с бонусом: ${crystalOreWithBuff.toInt()}")
    println("Железная руда с бонусом: ${ironOreWithBuff.toInt()}")
}