package lesson_7

fun main() {

//    println("Сколько символов будет в вашем пароле?")
//
//    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
//    val numberSymbolMin = 6
//    val numberSymbolMax = readln().toInt()
//    var password = ""
//
//    for (i in numberSymbolMin..numberSymbolMax) {
//        password += chars.random()
//        }
//    println("Ваш пароль: $password")
//    }
    println("Enter password length please:")
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val passwordLength1 = readln().toInt()
    var password = ""
    for (i in 0 until passwordLength1) {
        password += chars.random()
    }
    println("Your random password: $password")
}