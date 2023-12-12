package Vehicle

class Copter : Car(), FuelEfficient{
    override val speed = 600
    override var color = "Green"
    override val marka = "Oboronnoe predpriaytie"

    override fun fuelEfficiency() {
        println("Ispo;zuet elekrichestvo")
    }

    fun batteryCapacity() {
        println("S polnoiy batareeiy letaet 4 chasa")
    }
    override fun makeSound() {
        println("Copter izdaet zvuk fiu-fiu-fiu-fiu")
    }
    override fun displayInfo() {
        println("_________________________________________")
        super.displayInfo()
        println("Sozdatel: $marka")
        makeSound()
        batteryCapacity()
        fuelEfficiency()
        println("_________________________________________")
    }
}