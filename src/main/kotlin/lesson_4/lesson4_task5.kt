package org.example.lesson_4

fun main() {
    println("Не имеется ли повреждений корпуса (true - не имеется / false - имеется)?")
    val isCaseNotDamaged = readln().toBoolean()

    println("Каков текущий состав экипажа?")
    val crewNumber = readln().toInt()

    println("Сколько ящиков с провизией на борту?")
    val boxesQuantity = readln().toInt()

    println("Благоприятная ли погода? (true - благоприятная / false - неблагоприятная)")
    val isWeatherFavourable = readln().toBoolean()

    val minCrewNumber = 55
    val maxCrewNumber = 70
    val minBoxesQuantity = 50

    val canShipSail = (
            (boxesQuantity > minBoxesQuantity &&
            crewNumber in minCrewNumber..maxCrewNumber &&
            isWeatherFavourable &&
            isCaseNotDamaged) ||
            (!isCaseNotDamaged &&
            crewNumber == maxCrewNumber &&
            isWeatherFavourable &&
            boxesQuantity >= minBoxesQuantity)
            )

    println("Корабль может отправиться в плавание: $canShipSail")
}