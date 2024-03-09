package lesson_13

class Client(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val contactsList = listOf(
        Client("Victory", 89991111112),
        Client("Mary", 89907777272),
        Client("Oleg", 89992223233, null),
        Client("Victor", 89994444545, "Amazon"),
        Client("Den", 89992222121, "Amazon")
    )

    for (contact in contactsList) {
        contact.printInfo()
        println()
    }

    val companies = contactsList.mapNotNull { it.company }.distinct()

    println("Список компаний в телефонной книге: $companies")

}