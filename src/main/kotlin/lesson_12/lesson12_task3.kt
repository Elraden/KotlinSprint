package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273.15

class WeatherInfo(
    dayTemperature: Double,
    nightTemperature: Double,
    precipitationAvailable: Boolean
) {
    val dayTemperature: Int = (dayTemperature - KELVIN_TO_CELSIUS).toInt()
    val nightTemperature: Int = (nightTemperature - KELVIN_TO_CELSIUS).toInt()
    val precipitationAvailable = precipitationAvailable

    fun printWeather() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $precipitationAvailable")
    }
}

fun main() {
    val weather = WeatherInfo(300.1, 289.5, true)

    weather.printWeather()
}