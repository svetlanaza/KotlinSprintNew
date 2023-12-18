package lesson_9

fun main() {
    val mutableListIngredients = mutableListOf("апельсин", "имбирь", "сахар", "корица")
    println("В рецепте есть следующие ингредиенты: ${mutableListIngredients.map { it }}")

    mutableListIngredients.forEach { it ->
        println(it)
    }
}