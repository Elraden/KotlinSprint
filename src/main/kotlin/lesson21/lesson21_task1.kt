package org.example.lesson21

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

