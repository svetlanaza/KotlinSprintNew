package lesson_13

class ClientContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val contacts = mutableListOf<ClientContact>()
    println("Хотите добавить контакт?")
    val onswer = readln()

    while (onswer== "да") {
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
    }

    contacts.forEach { it.printInfo() }
}