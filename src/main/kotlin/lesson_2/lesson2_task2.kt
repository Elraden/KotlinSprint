package org.example.lesson_2

fun main() {
    val workersQuantity = 50
    val workersSalary = 30000

    val traineeQuantity = 30
    val traineeSalary = 20000

    val totalWorkersSalary = workersQuantity * workersSalary
    val totalTraineeSalary = traineeSalary * traineeQuantity
    val totalEmployeeSalary = totalWorkersSalary + totalTraineeSalary
    val employeeQuantity = workersQuantity + traineeQuantity
    val employeeMeanSalary =  totalEmployeeSalary / employeeQuantity

    println(totalWorkersSalary)
    println(totalEmployeeSalary)
    println(employeeMeanSalary)
}