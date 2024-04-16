package lesson_18

class Order(private val id: Int) {

    fun printProduct(product: String) {
        println("Номер заказа $id. Заказан товар: $product.")
    }

    fun printProduct(products: List<String>) {
        println("Номер заказа $id. Заказаны товары: ${products.joinToString(" ,")}.")
    }
}

fun main() {
    val product1 = Order(76)
    product1.printProduct("Спортивная сумка")

    val product2 = Order(727)
    product2.printProduct(listOf("Мяч, скейт, шлем"))

}