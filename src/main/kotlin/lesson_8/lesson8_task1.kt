package org.example.lesson_8

fun main() {
    val mon = 135
    val tue = 250
    val wed = 111
    val thu= 100
    val fri = 99
    val sat = 31
    val sun = 500
    var viewsSum = 0

    val viewsHistory = intArrayOf(mon,tue, wed, thu, fri, sat, sun)
    for (viewPerDay in viewsHistory) {
        viewsSum += viewPerDay
    }
    println("Всего просмотров за неделю: $viewsSum")
}