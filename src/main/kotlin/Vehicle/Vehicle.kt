package Vehicle

abstract class Vehicle {
    open val speed = 0
    open var color = ""

    open fun displayInfo() {
        println("Maximalnay skorost: $speed km/h \n" +
                "Cvet transporta:    $color")
    }

    abstract fun makeSound()
}