package org.example.lesson_2

import kotlin.math.pow

const val INTEREST_RATE = 16.7
const val PERCENT_DIVISOR = 100
const val BASE_RATE = 1.0

fun main() {
    val initialDeposit = 70000
    val rate = INTEREST_RATE / PERCENT_DIVISOR
    val years = 20

    val finalAmount = initialDeposit * (BASE_RATE + rate).pow(years)

    val formattedAmount = String.format("%.3f", finalAmount)

    println(formattedAmount)
}