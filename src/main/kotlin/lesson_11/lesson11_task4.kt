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
    val cookingInstructions: String,
    val ingredients: List<Ingredient>,
    val method: List<String>,
)
