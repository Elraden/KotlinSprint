package org.example.lesson_2

const val MINUTES_PER_HOUR = 60

fun main() {
    val departureMinutes = 39
    val travelTime = 457
    val departureHour = 9

    val departureTimeMinutes = departureHour * MINUTES_PER_HOUR + departureMinutes
    val arrivalFullTime = departureTimeMinutes + travelTime

    val arrivalHour = arrivalFullTime / MINUTES_PER_HOUR
    val arrivalMinute = arrivalFullTime % MINUTES_PER_HOUR
    println("$arrivalHour:$arrivalMinute")
}