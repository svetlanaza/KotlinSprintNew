package lesson_16

class User11(private val login: String, private val password: String) {

    fun getValidate(enter: String): Boolean {
        return enter == password
    }
}

fun main() {

    val user = User11("логин", "123pass")

    println("Корректность пароля: ${user.getValidate("11yyy")}")

}