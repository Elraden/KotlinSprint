package org.example.lesson_5

import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100
const val BMI_NORMAL_START = 18.5
const val BMI_NORMAL_END = 25.0
const val BMI_OVERWEIGHT = 30.0

fun main() {
    println("Введите Ваш вес:")
    val userWeight = readln().toFloat()

    println("Введите ваш рост в см")
    val userHeight = readln().toFloat()

    val userHeightMeter = userHeight / CENTIMETERS_IN_METER

    val bmi = userWeight / userHeightMeter.pow(2)
    val formattedBmi = String.format("%.2f", bmi)

    val bmiTextResult = when {
        bmi < BMI_NORMAL_START -> "Недостаточная масса тела"
        bmi >= BMI_NORMAL_START && bmi < BMI_NORMAL_END -> "Нормальная масса тела"
        bmi >= BMI_NORMAL_END && bmi < BMI_OVERWEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ = $formattedBmi; $bmiTextResult")
}