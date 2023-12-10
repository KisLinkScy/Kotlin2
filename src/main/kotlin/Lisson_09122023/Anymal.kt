package Lisson_09122023

open class Anymal {
    open var image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The Animal is making noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    open fun sleep() {
        println("The Animal is sleeping")
    }
}