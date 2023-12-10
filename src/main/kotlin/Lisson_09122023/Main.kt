package Lisson_09122023

fun main(args: Array<String>) {
    val animals = arrayOf(
        Hippo(),
        Wolf(),
        Lion(),
        Cheetah(),
        Lynx(),
        Fox()
    )

    for (item in animals) {
        println("${item.image}")
        item.makeNoise()
        item.roam()
        item.eat()
        println("________________________")
    }
}