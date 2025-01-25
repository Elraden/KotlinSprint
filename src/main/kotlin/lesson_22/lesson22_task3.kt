package org.example.lesson_22

data class Student(val name: String, val age: Int, val group: String)

fun main() {
    val student = Student("Сергей", 19, "А432")
    val (name, age, group) = student
    println("Имя: $name, Возраст: $age, Группа: $group")
}