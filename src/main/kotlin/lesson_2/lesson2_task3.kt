package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457

    val departureTimeMinutes = departureHour * 60 + departureMinutes
    val arrivalFullTime = departureTimeMinutes + travelTime

    val arrivalHour = arrivalFullTime / 60
    val arrivalMinute = arrivalFullTime % 60
    println("$arrivalHour:$arrivalMinute")
}