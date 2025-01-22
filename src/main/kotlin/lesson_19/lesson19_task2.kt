package org.example.lesson_19

enum class Category(private val title: String) {
    CLOTHES("Одежда"),
    OFFICE_SUPPLIES("Офисные принадлежности"),
    MISCELLANEA("Разное");

    fun getTitle(): String = title
}

class Product(private val name: String, private val id: Int, private val category: Category) {
    fun showProductInfo() {
        val productCategory = category.getTitle()
        println("Товар: $name, ID товара: $id, Категория товара: $productCategory")
    }
}

fun main() {
    val product1 = Product("Рубашка поло", 101, Category.CLOTHES)
    val product2 = Product("Скрепки", 31, Category.OFFICE_SUPPLIES)
    val product3 = Product("Кружка", 78, Category.MISCELLANEA)

    product1.showProductInfo()
    product2.showProductInfo()
    product3.showProductInfo()
}