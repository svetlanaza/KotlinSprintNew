package lesson_13

class ClientUser(
    private val name: String,
    private val phoneNumber: String,
    private val company: String? = null
)

fun main() {

    println("Введите номер телефона: ")
    val phoneInput = readlnOrNull()?.trim() ?: ""

    try {
        val phoneNumber = phoneInput.toLong()
        println("Введенный номер: $phoneNumber")
    } catch (e: NumberFormatException) {
        println("Произошла ошибка: ${e::class.simpleName}")
    }
}







