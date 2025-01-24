package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    val maxSkillValue = this.values.max()
    val maxSkillsValues = this.filter {
        it.value == maxSkillValue
    }

    return maxSkillsValues.keys.first()
}

fun main() {
    val skills = mapOf(
        "agility" to 40,
        "strength" to 20,
        "endurance" to 30,
        "fate" to 40)

    println(skills.maxCategory())
}