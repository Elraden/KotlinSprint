package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri. Первая встреча с инопланетянами",
        description = "В 2150 году астрономическая экспедиция с Земли зафиксировала первый официальный контакт с внеземной цивилизацией в системе Альфа Центавра.",
        date = LocalDateTime.of(2150, 1, 1, 12, 0),
        distanceFromEarth = 4.37
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val date = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println("""
        Название: $name
        Описание: $description
        Дата и время события: $date
        Расстояние от Земли: $distanceFromEarth световых лет
    """.trimIndent())
}