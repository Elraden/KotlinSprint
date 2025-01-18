package org.example.lesson_12

class Weather() {
    var dayTemperature = 0
    var nightTemperature = 0
    var precipitationAvailable = false

    fun printWeather() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $precipitationAvailable")
    }
}

fun main() {
    val weather1 = Weather()
    weather1.dayTemperature = 10
    weather1.nightTemperature = -1
    weather1.precipitationAvailable = true

    val weather2 = Weather()
    weather2.dayTemperature = 3
    weather2.nightTemperature = -7
    weather2.precipitationAvailable = true

    println("День 1")
    weather1.printWeather()
    println()
    println("День 2")
    weather1.printWeather()

}