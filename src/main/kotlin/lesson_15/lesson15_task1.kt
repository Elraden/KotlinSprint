package org.example.lesson_15

interface FlyingCreatures {
    fun fly(): String
}

interface FloatingCreatures {
    fun swim(): String
}

class Carp (): FloatingCreatures {
    override fun swim(): String {
        return "Карась плывет"
    }
}

class Seagull(): FlyingCreatures {
    override fun fly(): String {
        return "Чайка летит"
    }
}

class Duck(): FlyingCreatures, FloatingCreatures {
    override fun fly(): String {
        return "Утка летит"
    }

    override fun swim(): String {
        return "Утка плывет"
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println(carp.swim())

    println(seagull.fly())
    println(duck.fly())
    println(duck.swim())

}