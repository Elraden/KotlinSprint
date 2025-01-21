package org.example.lesson_15

abstract class MusicProduct(
    val name: String,
    val amount: Int
)

interface AccessorySearch {
    fun searchAccessories(): String
}

class Instrument(name: String, amount: Int) : MusicProduct(name, amount), AccessorySearch {
    override fun searchAccessories(): String {
        return "Выполняет поиск комплектующих для инструмента: $name"
    }
}

class Accessories(name: String, amount: Int) : MusicProduct(name, amount)

fun main() {
    val instrument = Instrument("Электронная барабанная установка", 10)
    val accessories = Accessories("Барабанные палочки", 140)

    instrument.searchAccessories()

    println("Товар ${instrument.name}. Количество на складе: ${instrument.amount}")
    println("Товар ${accessories.name}. Количество на складе: ${accessories.amount}")
}