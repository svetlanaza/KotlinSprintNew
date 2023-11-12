package lesson_2

fun main() {
    val numbersEmployees = 50
    val salaryEmployees = 30000
    val numbersTrainee = 30
    val salaryTrainee = 20000
    val salaryExpensesEmployees = numbersEmployees * salaryEmployees
    val generalExpenses = (numbersTrainee * salaryTrainee + salaryExpensesEmployees)
    val averageSalary = generalExpenses / (numbersEmployees + numbersTrainee)

    println(salaryExpensesEmployees)
    println(generalExpenses)
    println(averageSalary)
}