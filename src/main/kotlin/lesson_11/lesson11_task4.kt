package lesson_11

class Category(
    val id: Int,
    val title: String,
    val imageLinc: String,
    val description: String
)
class Ingredient(
    val title: String,
    val quantity: Int,
    val unitOfMeasure: String,
)

class Recipe(
    val title: String,
    val cookingInstructions: String
)
fun main() {
    val category = Category(
        1,
        "Бургеры",
        "gjk1.image",
        "Рецепты всех популярных бургеров"
    )
    val recipe = Recipe(
         "Бугрер с грибами и сыроом",
        "Положите котлеты на нижнюю часть булочек" +
                " и выложите сверху каждой котлеты кетчуп, " +
                "если используете, и большую ложку с горкой грибной икры. " +
                "Накройте верхушками булочек"
    )
    val ingredients = listOf(
        Ingredient("творог", 350, "гр"),
        Ingredient("яйцо", 2, "шт"),
        Ingredient("мука", 6, "ст. ложка"),
        Ingredient("подсолнечное масло", 5, "ст. ложка"),
        Ingredient("сахар", 2, "ст. ложка")
    )


    println(category.id)
    println(category.title)
    println(category.imageLinc)
    println(category.description)
    println()
    println(recipe.title)
    for (ingredient in ingredients) {
        println("${ingredient.title}: ${ingredient.quantity} ${ingredient.unitOfMeasure}")
    }




}