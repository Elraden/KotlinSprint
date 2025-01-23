package org.example.lesson_18

class Order(val orderId: String) {
    fun showOrderInfo(product: String): String {
        return "Заказан товар: $product"
    }

    fun showOrderInfo(products: List<String>): String {
        return "Заказаны следующие товары: ${products.joinToString(", ")}"
    }

}
fun main() {
    val order1 = Order("AB342SE")
    println(order1.showOrderInfo("Наушники JBL"))


    val order2 = Order("KS3D31A")
    println(order2.showOrderInfo(listOf("Клавиатура Razer", "Колонки Marshall", "Монитор Acer")))
}