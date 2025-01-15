package org.example.lesson_15

abstract class WeatherStationStats() {
    abstract fun getData(): String
}

class Temperature(private val temperature: Int) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура: $temperature С"
    }

}

class PrecipitationAmount(private val precipitationAmount: Double) : WeatherStationStats() {
    override fun getData(): String {
        return "Количество осадков: $precipitationAmount мм"
    }

}

class WeatherServer {
    fun sendData(stats: WeatherStationStats) {
        println("Отправка данных на сервер: ${stats.getData()}")
    }
}

fun main() {
    val temperature = Temperature(30)
    val precipitationAmount = PrecipitationAmount(3.1)

    val server = WeatherServer()

    server.sendData(temperature)
    server.sendData(precipitationAmount)
}