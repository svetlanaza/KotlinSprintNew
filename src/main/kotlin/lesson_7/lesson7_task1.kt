package lesson_7

fun main() {
    val range1 = 1..9
    val range2 = 'a'..'z'
    var password = ""

    for (i in 1..6) {
        if (i % 2 == 0) {
            range1.random()
            password += range1.random()
        } else {
            range2.random()
            password += range2.random()
        }
    }
    println(password)
}