package org.example.lesson_5

const val PERCENT_100 = 100

fun main() {
    println("Введите расстояние поездки в км")
    val s = readln().toFloat()

    println("Введите расход топлива на 100 км в литрах")
    val fuelFlow = readln().toFloat()

    println("Введите текущую цену за литр топлива")
    val fuelPrice = readln().toFloat()

    val fuelForTravel = (s * fuelFlow) / PERCENT_100

    val totalFuelPrice = fuelForTravel * fuelPrice

    println("Общее необходимое количество топлива = ${String.format("%.2f", fuelForTravel)}")
    println("Итоговая стоимость поездки = ${String.format("%.2f", totalFuelPrice)}")
}