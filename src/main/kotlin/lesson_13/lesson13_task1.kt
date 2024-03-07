package lesson_13

class Contact (
    val name: String,
    val phoneNumber: Long,
    val company: String?
    )
fun main() {
    val contact1 =
        Contact(
            name = "Mary",
            phoneNumber = 89997777272,
            company = null
        )
}