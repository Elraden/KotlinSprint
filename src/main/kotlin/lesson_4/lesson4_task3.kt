package org.example.lesson_4


const val REQUIRED_SUNNY_WEATHER = true
const val REQUIRED_TENT_STATE = true
const val REQUIRED_HUMIDITY_PERCENT = 20
const val UNFAVORABLE_SEASON = "зима"

fun main() {
    val isSunnyToday = true
    val isTentOpen = true
    val humidityPercent = 20
    val currentSeason = "зима"

    val optimalGrowthConditions = (isSunnyToday == REQUIRED_SUNNY_WEATHER) &&
                                  (isTentOpen == REQUIRED_TENT_STATE) &&
                                  (humidityPercent == REQUIRED_HUMIDITY_PERCENT) &&
                                  (currentSeason != UNFAVORABLE_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $optimalGrowthConditions")


}