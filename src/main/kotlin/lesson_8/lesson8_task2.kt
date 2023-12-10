package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("апельсин", "имбирь", "сахар", "корица")

    println("Какой ингредиент вы хотите найти?")

    val ingredient = readln()

    for (i in arrayOfIngredients) {
        if (i == ingredient) {
            println("Такой ингредиент в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}

