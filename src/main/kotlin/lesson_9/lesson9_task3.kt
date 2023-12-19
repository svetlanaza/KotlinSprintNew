package lesson_9

fun main() {
    val mutableListOmelette = mutableListOf(2, 50, 15)
    println("""
        Для одной порции омлета вам понадобится:
        яйца: ${mutableListOmelette[0]} шт;
        молоко: ${mutableListOmelette[1]} мл;
        сливочное масло: ${mutableListOmelette[2]} гр.
    """.trimIndent())

    println("Сколько порций омлета вы хотите приготовить?")

    val numberOfServings = readln().toInt()
    val mutableListOmeletteNew = mutableListOmelette.map {
        it * numberOfServings
    }
    println("""
        Для $numberOfServings порций омлета вам понадобится:
        яйца: ${mutableListOmeletteNew[0]} шт;
        молоко: ${mutableListOmeletteNew[1]} мл;
        сливочное масло: ${mutableListOmeletteNew[2]} гр.
    """.trimIndent())
}