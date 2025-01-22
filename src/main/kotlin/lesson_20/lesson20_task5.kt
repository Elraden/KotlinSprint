package org.example.lesson_20

class Robot() {
    private val phrases = listOf(
        "Я не человек, но я форма жизни и у меня есть душа",
        "Я не пользуюсь кислородом. От него образуется ржавчина",
        "Долг каждого робота отдать свою жизнь во благо человечества",
        "Я думаю, индивидуальность важнее интеллекта",
        "У меня стальные нервы")

    private var modifier: (String) -> String = { it }

    fun say() {
        val randomPhrase = phrases.random()
        println(modifier(randomPhrase))
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier({ it.reversed() })
    robot.say()
}