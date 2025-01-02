package org.example.lesson_12

class DailyWeather(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val precipitationAvailable: Boolean,
) {
    fun printWeather() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $precipitationAvailable")
    }
}

fun main() {
    val weather = DailyWeather(22, 11, true)

    weather.printWeather()
}