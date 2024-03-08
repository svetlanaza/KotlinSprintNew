package lesson_7

fun main() {

    println("Сколько символов будет в вашем пароле (минимум 6)?")

    val charRange = 'a'..'z'
    val intRange = '0'..'9'
    val charRangeRegister = 'A'..'Z'
    val allChars = charRange + intRange + charRangeRegister
    val numberSymbolMax = readln().toInt()
    val password = mutableListOf<Char>()

    if (numberSymbolMax >= 6) {

        password.add(charRange.random())
        password.add(intRange.random())
        password.add(charRangeRegister.random())

        for (i in 4..numberSymbolMax) {
            password.add(allChars.random())
        }
        password.shuffle()
        println(password.joinToString(""))
    } else {
        println("Не достаточно символов")
    }
}








