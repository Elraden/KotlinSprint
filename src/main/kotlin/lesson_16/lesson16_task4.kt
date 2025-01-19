package org.example.lesson_16

class Order(
    private val orderId: Int,
    private var status: String
) {
    fun getStatus(): String {
        return status
    }

    fun requestStatusChange(newStatus: String) {
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }
}

fun main() {
    val order = Order(1, "принят")
    println("Статус заказа: ${order.getStatus()}")
    order.requestStatusChange("в обработке")
    println("Статус заказа: ${order.getStatus()}")
}