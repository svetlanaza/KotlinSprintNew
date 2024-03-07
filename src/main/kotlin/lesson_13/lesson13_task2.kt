package lesson_13

class Subscriber (
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}


fun main() {
    val contact1 =
        Subscriber(
            name = "Mary",
            phoneNumber = 89997777272,
        )
    contact1.printInfo()

}