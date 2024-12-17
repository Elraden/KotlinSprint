package org.example.lesson_2

const val PERCENT_100 = 100f

fun main() {
    val crystalOre = 7
    val ironOre = 10
    val buff = 20
    val crystalOreWithBuff = crystalOre + (crystalOre * (buff / PERCENT_100))
    val ironOreWithBuff = ironOre + (ironOre * (buff / PERCENT_100))

    println("Кристальная руда с бонусом: ${crystalOreWithBuff.toInt()}")
    println("Железная руда с бонусом: ${ironOreWithBuff.toInt()}")
}