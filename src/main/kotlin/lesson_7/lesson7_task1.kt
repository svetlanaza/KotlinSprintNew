package lesson_7

fun main() {
    val range1 = 1..9
    val range2 = 'a'..'z'
    var password = ""
    var isChar = true

    for (i in 1..6) {
        if (isChar) {
            range1.random()
            password += range1.random()
        } else {
            range2.random()
            password += range2.random()
        }
        isChar = !isChar
    }
    println(password)
}