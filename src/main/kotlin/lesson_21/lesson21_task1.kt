package org.example.lesson_21

fun String.vowelCount(): Int {
    var vowelCount = 0
    this.forEach { char ->
        when (char.lowercaseChar()) {
            'a', 'e', 'o', 'i', 'y', 'u' -> vowelCount++
        }
    }
    return vowelCount
}

fun main() {
    val text = "hello"
    println("Количество гласных в строке: ${text.vowelCount()}")
}

