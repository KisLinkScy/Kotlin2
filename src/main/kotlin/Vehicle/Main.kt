package Vehicle

fun main() {
    val vehicles = arrayOf(
        Bike(),
        Car(),
        Copter()
    )

    for (item in vehicles) {
        println("${item.displayInfo()}")
    }


}