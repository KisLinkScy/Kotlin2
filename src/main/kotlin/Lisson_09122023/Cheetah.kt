package Lisson_09122023

class Cheetah : Anymal() {
    override var image = "Cheetah.jpg"
    override val food = "Антилоп"
    override val habitat = "Саванна"

    override fun makeNoise() {
        println("Рычание")
    }

    override fun eat() {
        println("Гепард ест $food")
    }

    override fun roam() {
        println("Среда обитания гепарда - $habitat")
    }
}