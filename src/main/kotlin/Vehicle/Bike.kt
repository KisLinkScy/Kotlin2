package Vehicle

class Bike : Vehicle(), FuelEfficient {
    override val speed = 350
    override var color = "Red"
    val marka = "Honda"
    val numOfWheels = 2

    override fun fuelEfficiency() {
        println("Ispolzuet fiz-silu")
    }
    fun road() {
        println("Voditel peredvigaetcay verxom na baike")
    }

    override fun makeSound(){
        println("Bike ezdit bez zvuka")
    }
    override fun displayInfo() {
        println("_________________________________________")
        println("Proizvoditel baika: $marka \n" +
                "Maximalnay skorost: $speed km/h \n" +
                "Cvet transporta:    $color \n" +
                "Kolichestvo koles:  $numOfWheels")
        road()
        makeSound()
        fuelEfficiency()
        println("_________________________________________")
    }
}