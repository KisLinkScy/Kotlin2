package Polinom

fun main() {
    val p1 = Polinom(doubleArrayOf(1.0, 0.0, 3.0, 0.0, 0.0))
    val p2 = Polinom(doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0))
    val p3 = Polinom(doubleArrayOf(0.0, 0.0, -3.0, 0.0, -1.0))
    val p4 = Polinom(doubleArrayOf(7.0, 0.0, 3.0, 0.0, 0.0))
    val p5 = Polinom(doubleArrayOf(-1.0, 0.0, 2.0, 0.0, 0.0))
    val p6 = Polinom(doubleArrayOf(1.0, 0.0, 0.0, 0.0, 0.0))
    println(p1)
    println(p2)
    println(p3)
    println(p4)
    println(p5)
    println(p6)
    println(p1(2.0))
}