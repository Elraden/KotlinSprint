package org.example.lesson_4

fun main() {
    val isCaseNotDamaged = readln().toBoolean()
    val crewNumber = readln().toInt()
    val boxesQuantity = readln().toInt()
    val isWeatherFavourable = readln().toBoolean()

    val minCrewNumber = 55
    val maxCrewNumber = 70
    val crewNumberRange = minCrewNumber..maxCrewNumber
    val minBoxesQuantity = 50
    val recommendedCrewNumber = crewNumber in crewNumberRange
    val recommendedBoxesQuantity = boxesQuantity > minBoxesQuantity

    val favourableCondition = recommendedBoxesQuantity &&
                              recommendedCrewNumber &&
                              isWeatherFavourable &&
                              isCaseNotDamaged

    val alternateCondition = !isCaseNotDamaged &&
                             crewNumber == maxCrewNumber &&
                             isWeatherFavourable &&
                             boxesQuantity >= minBoxesQuantity

    println("Корабль может отправиться в плавание: ${favourableCondition || alternateCondition} ")
}