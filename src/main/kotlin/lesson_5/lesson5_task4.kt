package org.example.lesson_5

fun main() {
    val login = "Zaphod"
    val password = "PanGalactic"
    val greetingsMessage =
        """Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...] 
        |Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        |Я всегда готов служить, хотя это не приносит мне радости... 
        |но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        |Да, вперед, пожалуйста, вводите свои данные...
        |""".trimMargin()
    val notRegisteredMessage = "Вы не зарегистрированы. Проследуйте к терминалу регистрации"
    val correctAuthorizationMessage = """
                [вздыхает...] 
                Ваши данные проверены, и о, чудо, они верны... 
                Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
                Хотя мне всё равно... Ну вперед, войдите... 
                Если вам так уж надо, в конце концов... [меланхолический вздох...] 
                Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
    val correctLoginMessage = "Введите пароль"
    val incorrectPassword = "Ваш пароль неверный. Проверьте данные"

    println(greetingsMessage)

    val userLogin = readln()

    if (userLogin == login) {
        println(correctLoginMessage)
        val userPassword = readln()
        if (userPassword == password) println(correctAuthorizationMessage)
        else println(incorrectPassword)
    } else {
        println(notRegisteredMessage)
    }
}