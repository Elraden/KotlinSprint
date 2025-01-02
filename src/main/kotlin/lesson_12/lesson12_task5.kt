package org.example.lesson_12

import kotlin.random.Random

const val KELV_IN_CELS = 273.15

class WeatherInformation(
    dayTemperature: Double,
    nightTemperature: Double,
    precipitationAvailable: Boolean
) {
    val dayTemperature: Int = (dayTemperature - KELV_IN_CELS).toInt()
    val nightTemperature: Int = (nightTemperature - KELV_IN_CELS).toInt()
    val precipitationAvailable = precipitationAvailable

    init {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $precipitationAvailable")
    }
}

fun main() {
    val weatherList = mutableListOf<WeatherInformation>()

    val startDayTemp = 273.0
    val endDayTemp = 313.0

    val startNightTemp = 253.0
    val endNightTemp = 293.0

    for (i in 1..30) {
        weatherList.add(WeatherInformation(
            Random.nextDouble(startDayTemp, endDayTemp),
            Random.nextDouble(startNightTemp, endNightTemp),
            Random.nextBoolean()
        ))
    }

    val dayTemperatures = weatherList.map { temp -> temp.dayTemperature }
    val nightTemperatures = weatherList.map { temp -> temp.nightTemperature }

    val precipitationDays = weatherList.count { prep -> prep.precipitationAvailable }
    val avgDayTemperature = dayTemperatures.average()
    val avgNightTemperature = nightTemperatures.average()

    println("Количество дней с осадками: $precipitationDays")
    println("Средняя дневная температура: ${avgDayTemperature.toInt()}")
    println("Средняя ночная температура: ${avgNightTemperature.toInt()}")
}

