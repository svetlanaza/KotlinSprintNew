package lesson_10

fun main() {
    println("Введите логин и пароль поочередно")

    val login = readln()
    val password = readln()

    if (validateData(login) && validateData(password)) {
        println("Добро пожаловать! Вы зарегистрированы")
    } else {
        println("Недостаточная длина логина или пароля")
    }
}

fun validateData(data: String): Boolean {
    return data.length >= MIN_LENGTH_DATA
}

const val MIN_LENGTH_DATA = 4