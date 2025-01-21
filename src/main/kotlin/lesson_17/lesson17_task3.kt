package org.example.lesson_17

class Folder(
    private val realName: String,
    private var realFileQuantity: Int,
    private val flagSecret: Boolean
) {
    val name: String
        get() = if (flagSecret) "скрытая папка" else realName

    val fileQuantity: Int
        get() = if (flagSecret) 0 else realFileQuantity
}

fun main() {
    val secretFolder = Folder("Общая папка", 10, false)
    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.fileQuantity}")

    val secretFolder2 = Folder("Личная папка", 31, true)
    println("Имя папки: ${secretFolder2.name}")
    println("Количество файлов: ${secretFolder2.fileQuantity}")
}