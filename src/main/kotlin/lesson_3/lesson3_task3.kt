package lesson_3

fun main() {
    var number = 7
    var counter = 1
    val calculation1 = counter * number
    val calculation2 = ++counter * number
    val calculation3 = ++counter * number
    val calculation4 = ++counter * number
    val calculation5 = ++counter * number
    val calculation6 = ++counter * number
    val calculation7 = ++counter * number
    val calculation8 = ++counter * number
    val calculation9 = ++counter * number

    println("""
        $number * 1 = $calculation1
        $number * 2 = $calculation2
        $number * 3 = $calculation3
        $number * 4 = $calculation4
        $number * 5 = $calculation5
        $number * 6 = $calculation6
        $number * 7 = $calculation7
        $number * 8 = $calculation8
        $number * 9 = $calculation9
        
    """.trimIndent())

    number = 5

    println("""
        $number * 1 = $calculation1
        $number * 2 = $calculation2
        $number * 3 = $calculation3
        $number * 4 = $calculation4
        $number * 5 = $calculation5
        $number * 6 = $calculation6
        $number * 7 = $calculation7
        $number * 8 = $calculation8
        $number * 9 = $calculation9
        
    """.trimIndent())
}