package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun outputInUserInformation() {
        println("Данные пользователя N $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Электронная почта: $email")
        println("Новые данные: ${bio ?: "Нет данных"}")
    }

    fun changePassword() {
        println("Введите старый пароль")

        val checkPassword = readln()

        if (checkPassword == password) {
            println("Введите новый пароль")
        }
        val passwordNew = readln()
        password = passwordNew

        println("Пароль изменен на $passwordNew!")

    }

    fun bioInform() {
        val newBio = readln()
        bio = newBio
        println("Данные обновлены")
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "qwerty72",
        password = "kat72",
        email = "qwerty72@mail.com"
    )
    user.outputInUserInformation()

    println("Хотите изменить пароль?")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        user.changePassword()
    }
    user.outputInUserInformation()

    println("Хотите добавить данные?")
    val answer2 = readln()

    if (answer2.equals("да", ignoreCase = true)) {
        user.bioInform()
    }
    user.outputInUserInformation()
}



