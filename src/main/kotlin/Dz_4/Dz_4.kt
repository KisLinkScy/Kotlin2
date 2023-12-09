package Dz_4

fun main(args: Array<String>) {
    println("---------------------------------------------------")
    println("Задание №4")
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var x1 = 0
    var y1: Int


    while (x1 < 4) {
        y1 = index[x1]
        println("Fruit = ${fruit[y1]}")
        x1 += 1
    }
}