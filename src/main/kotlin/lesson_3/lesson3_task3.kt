package lesson_3

fun main() {
    val number = 7
    var counter = 1

    println(
        """
        $number * $counter = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        $number * ${++counter} = ${number * counter}
        
    """.trimIndent()
    )
}
