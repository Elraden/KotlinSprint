package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean
) { }
class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val satellites: List<Satellite>
): CelestialBody(name, hasAtmosphere, isHabitable) {

}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
): CelestialBody(name, hasAtmosphere, isHabitable) {

}

fun main() {
    val moon1 = Satellite(name = "Фобос", hasAtmosphere = false, isHabitable = false)
    val moon2 = Satellite(name = "Деймос", hasAtmosphere = false, isHabitable = false)

    val planet = Planet(
        name = "Марс",
        hasAtmosphere = true,
        isHabitable = true,
        satellites = listOf(moon1, moon2)
        )

    println("Планета: ${planet.name}")
    println("Спутники:")
    planet.satellites.forEach { satellite -> println("- ${satellite.name}") }
}
