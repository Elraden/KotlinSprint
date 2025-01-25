package org.example.lesson_21

import java.io.File

fun File.saveWordToFile(text: String) {
    val oldText = if (exists()) readText() else ""
    writeText(text.lowercase() + "\n" + oldText)
}

fun main() {
    val file = File("file.txt")
    file.saveWordToFile("первое")
    file.saveWordToFile("второе")
    file.saveWordToFile("третье")
}