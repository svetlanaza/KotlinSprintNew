package lesson_16

const val NUMBER_OF_ORDER = 1

class Older() {

    private var statusOfOrder = "Заказ собирается"

    fun getChangeOfStatus() = statusOfOrder

    fun setChangeOfStatus(newStatus: String) {
        statusOfOrder = newStatus
    }
}

fun main() {
    val older = Older()
    println("Заказ N: $NUMBER_OF_ORDER")
    println("Статус заказа: ${older.getChangeOfStatus()}")
    println("Отправлена заявка об изменении статуса заказа.")
    older.setChangeOfStatus("Заказ отправлен")
    println("Cтатус заказа: ${older.getChangeOfStatus()}")
}
