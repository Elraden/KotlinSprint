package org.example.lesson_12

const val KELV_TO_CELS = 273.15

class WeatherReport(
    dayTemperature: Double,
    nightTemperature: Double,
    precipitationAvailable: Boolean
) {
    val dayTemperature: Int = (dayTemperature - KELV_TO_CELS).toInt()
    val nightTemperature: Int = (nightTemperature - KELV_TO_CELS).toInt()
    val precipitationAvailable = precipitationAvailable

    init {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $precipitationAvailable")
    }
}

fun main() {
    val weather = WeatherReport(300.1, 289.5, true)
}

