package Dz_2

fun main() {
    println("Задание №2")
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0

    while (x < 4) {
        println("| ${hobbits[x]} is a good Hobbit name: |")
        println("--------------------------------")
        x += 1
    }
}