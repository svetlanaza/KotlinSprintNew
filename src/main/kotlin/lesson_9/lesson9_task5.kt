package lesson_9

fun main() {
    println("Введите 5 ингредиентов по отдельности")
    val ingredients = MutableList(5) { readln() }.toSet().sorted()


    println(
        """Список ваших ингредиентов:
        ${
            (ingredients.joinToString(separator = ", ", postfix = "."))
                .replaceFirst(
                    ingredients[0].first(),
                    ingredients[0].first().uppercaseChar()
                )
        }
    """
    )
}