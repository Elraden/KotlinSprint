package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val initialDeposit = 70000
    val rate = 16.7 / 100
    val years = 20

    val finalAmount = initialDeposit * (1 + rate).pow(years)

    val formattedAmount = String.format("%.3f", finalAmount)

    println(formattedAmount)
}