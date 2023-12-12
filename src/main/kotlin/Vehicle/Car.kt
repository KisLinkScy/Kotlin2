package Vehicle

open class Car : Vehicle(), FuelEfficient {
    override val speed = 280
    override var color = "Wite"
    open val marka = "Lada"
    val numOfWheels = 4

    override fun fuelEfficiency() {
        println("Ispolzuet visokoaktanovoe toplivo")
    }
    fun polniyBak(){
        println("S polnim bakom proedet 600 km")
    }

    fun road() {
        println("Voditel peredvigaetcay vnutri avtomobilay")
    }

    override fun makeSound(){
        println("Mashina toroxtit")
    }
    override fun displayInfo() {
        println("_________________________________________")
        println("Proizvoditel mashini: $marka \n" +
                "Maximalnay skorost:   $speed km/h \n" +
                "Cvet transporta:      $color \n" +
                "Kolichestvo koles:    $numOfWheels")
        road()
        makeSound()
        polniyBak()
        fuelEfficiency()
        println("_________________________________________")
    }
}