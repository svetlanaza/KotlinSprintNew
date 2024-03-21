package lesson_13

class ClientContact(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val contacts = mutableListOf<ClientContact>()

    while (true) {
        println("Хотите добавить контакт?")

        if (readln().equals("нет", ignoreCase = true)) {
            return
        }
        print("Введите имя")
        val name = readln()
        if (name.isEmpty()) break

        print("Введите номер телефона")
        val phoneNumberInput = readln()
        val phoneNumber = phoneNumberInput.toLongOrNull()

        if (phoneNumber == null) {
            println("Неправильно введен номер")
            continue
        }
        print("Введите компанию")
        val company = readln().let { if (it.isEmpty()) null else it }

        contacts.add(ClientContact(name, phoneNumber, company))
        contacts.forEach {
            it.printInfo()
        }
    }
}