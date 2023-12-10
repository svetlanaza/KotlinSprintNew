package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("апельсин", "имбирь", "сахар", "корица")

    println("Какой ингредидиент вы хотите найти?")
    val ingredient = readln()

    if (ingredient in arrayOfIngredients) {
        println("Этот ингредиент в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}