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

interface WeatherCommand {
    fun execute(stats: WeatherStationStats): String
}

class SendWeatherDataCommand : WeatherCommand {
    override fun execute(stats: WeatherStationStats): String {
        return when (stats) {
            is Temperature -> stats.getData()
            is PrecipitationAmount -> stats.getData()
            else -> "Неизвестный тип данных"
        }
    }
}

class WeatherServer {
    fun sendData(command: WeatherCommand, stats: WeatherStationStats) {
        println("Отправка данных на сервер: ${command.execute(stats)}")
    }
}

fun main() {
    val temperature = Temperature(30)
    val precipitationAmount = PrecipitationAmount(3.1)

    val server = WeatherServer()
    val sendCommand = SendWeatherDataCommand()

    server.sendData(sendCommand, temperature)
    server.sendData(sendCommand, precipitationAmount)
}