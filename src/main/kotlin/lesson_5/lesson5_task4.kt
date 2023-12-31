package lesson_5

fun main() {
    val name = "Zaphod"
    val password = "PanGalactic"

    println("""Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля 
        "Heart of Gold". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить 
        к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... 
        но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...
        """.trimIndent())

    val userName = readln()

    println("Введите пароль")

    val newPassword = readln()

    if (userName != name)
        println("Пользователь не найден \n" +
                "Пройдите регистрацию")

    else if (newPassword == password)
        println("""
            Ваши данные проверены, и о, чудо, они верны... 
            Пользователь "Zaphod", вам разрешено входить 
            на борт корабля "Heart of Gold". Хотя мне всё равно... 
            Ну вперед, войдите... Если вам так уж надо, в конце концов... [
            меланхолический вздох...] 
            Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent())
    else
        println("Неверный пароль")




}