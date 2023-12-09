package Kalk

fun main() {
    println("Введите первое число:")
    val number1 = readLine()?.toDoubleOrNull()
    if(number1 == null){
        print("Пожалуйста, Введите число")
        return
    }

    println("Введите второе число:")
    val number2 = readLine()?.toDoubleOrNull()
    if(number2 == null){
        print("Пожалуйста, Введите число")
        return
    }

    println("Введите операцию (+, -, *, /)")
    val operation = readLine()

    val result = when (operation){
        "+" -> add(number1, number2)
        "-" -> sub(number1, number2)
        "*" -> mult(number1, number2)
        "/" -> div(number1, number2)
        else -> {
            println("Некорректная операция")
            return
        }
    }
    println()
    println()
    println("Результат: $number1 $operation $number2 = $result")
    println()
}

fun add(a: Double, b: Double) = a + b

fun sub(a: Double, b: Double): Double{
    if(b > a){
        println("-" + (b - a))
    }
    return a - b
}

fun mult(a: Double, b: Double) = a * b

fun div(a: Double, b: Double): Double{
    if (b == 0.0){
        println("Ошибка: Деление на ноль")
        throw IllegalArgumentException("Нельзя денить на ноль!")
    }
    return  a / b
}