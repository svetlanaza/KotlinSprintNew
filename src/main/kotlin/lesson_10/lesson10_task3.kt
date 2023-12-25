package lesson_10

fun main() {
    println("Введите длину пароля")
    val lengthPassword = readln().toInt()
    println("Ваш пароль: ${generatePasswords(lengthPassword)}")

}

fun generatePasswords(length: Int): String? {

    val charRange = ' '..'/'
    val intRange = 0..9
    var password = ""

    for (i in 1..length) {
        if (i % 2 == 0) password += charRange.random()
        else password += intRange.random()
    }
    return password
}