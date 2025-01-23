package org.example.lesson_17

class Package(val trackingNumber: String, initialLocation: String) {
    private var moveCount: Int = 0

    var currentLocation: String = initialLocation
        set(value) {
            if (field != value) {
                field = value
                moveCount++
                println("Посылка $trackingNumber прибыла в: $field. Количество перемещений: $moveCount")

            }
        }
}


fun main() {
    val package1 = Package("123QRFH23", "Москва")

    package1.currentLocation = "Казань"
    package1.currentLocation = "Санкт-Петербург"
    package1.currentLocation = "Москва"
    package1.currentLocation = "Москва"
}