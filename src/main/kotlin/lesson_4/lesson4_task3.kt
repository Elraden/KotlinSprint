package org.example.lesson_4

fun main() {
    val isSunnyToday = true
    val isTentOpen = true
    val humidityPercent = 20
    val currentSeason = "зима"
    val optimalHumidityPercent = 20
    val unfavorableSeason = "зима"

    val optimalGrowthConditions = isSunnyToday &&
                                  isTentOpen &&
                                  (humidityPercent == optimalHumidityPercent) &&
                                  (currentSeason != unfavorableSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $optimalGrowthConditions")


}