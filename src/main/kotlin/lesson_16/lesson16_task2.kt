package lesson_16

import kotlin.math.pow

private const val PI = 3.14
class Circle(private val radius: Double) {

    fun getCalculateCircumference(): Double {
      return PI * 2 * radius


    }
    fun getCalculateAreaCircle(): Double {
        return 2 * radius.pow(2)
    }
}

fun main() {
    val circumference = Circle(7.2)
    println("Длина окружности = ${circumference.getCalculateCircumference()}")

    val area = Circle(7.2)
    println("Площадь круга = ${area.getCalculateAreaCircle()}")

}