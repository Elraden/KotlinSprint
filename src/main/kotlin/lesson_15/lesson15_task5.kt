package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransportation {
    val maxPassengers: Int
    var currentPassengers: Int
    fun putPassenger(passengers: Int)
    fun dropOffPassenger(passengers: Int)
}

interface CargoTransportation {
    val maxCargo: Int
    var currentCargo: Int
    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)
}

class Truck : Movable, PassengerTransportation, CargoTransportation {
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0
    override val maxCargo = 2000
    override var currentCargo = 0

    override fun move() {
        println("Грузовик едет")
    }

    override fun putPassenger(passengers: Int) {
        if (currentPassengers + passengers <= maxPassengers) {
            currentPassengers += passengers
            println("Загружено $passengers пассажиров, всего пассажиров: $currentPassengers")
        } else {
            println("Невозможно загрузить $passengers пассажиров. Максимальная вместимость: $maxPassengers")
        }
    }

    override fun dropOffPassenger(passengers: Int) {
        if (currentPassengers - passengers >= 0) {
            currentPassengers -= passengers
            println("Выгружено $passengers пассажиров, всего пассажиров: $currentPassengers")
        } else {
            println("Невозможно выгрузить $passengers пассажиров. В машине всего $currentPassengers пассажиров")
        }
    }

    override fun loadCargo(weight: Int) {
        if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Загружено $weight кг груза. Всего груза $currentCargo")
        } else {
            println("Невозможно загрузить $weight кг груза. Максимальная вместимость $maxCargo кг")
        }
    }

    override fun unloadCargo(weight: Int) {
        if (currentCargo - weight > 0) {
            currentCargo -= weight
            println("Выгружено $weight кг груза. Всего груза: $currentCargo кг")
        } else {
            println("Невозможно выгрузить $weight кг груза. В грузовике всего $currentCargo кг груза")
        }
    }
}

class PassengerCar: Movable, PassengerTransportation {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun move() {
        println("Легковой автомобиль едет")
    }

    override fun putPassenger(passengers: Int) {
        if (currentPassengers + passengers <= maxPassengers) {
            currentPassengers += passengers
            println("Посажено $passengers пассажиров, всего пассажиров: $currentPassengers")
        } else {
            println("Невозможно посадить $passengers пассажиров. Максимальная вместимость: $maxPassengers")
        }
    }

    override fun dropOffPassenger(passengers: Int) {
        if (currentPassengers - passengers >= 0) {
            currentPassengers -= passengers
            println("Высажено $passengers пассажиров, всего пассажиров: $currentPassengers")
        } else {
            println("Невозможно высадить $passengers пассажиров. В машине всего $currentPassengers пассажиров")
        }
    }

}

fun main() {
    val truck = Truck()
    val car1 = PassengerCar()
    val car2 = PassengerCar()

    // Перевезём 6 человек
    car1.putPassenger(3)
    car2.putPassenger(3)
    car1.move()

    car2.move()
    car1.dropOffPassenger(3)
    car2.dropOffPassenger(3)

    println("-------------------")

    truck.loadCargo(2000)
    truck.move()
    truck.unloadCargo(2000)
}