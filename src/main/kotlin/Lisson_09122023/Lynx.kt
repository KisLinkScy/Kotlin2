package Lisson_09122023

class Lynx : Anymal() {
    override var image = "Lynx.jpg"
    override val food = "Мелких животных"
    override val habitat = "Лес"

    override fun makeNoise() {
        println("Мяукание")
    }

    override fun eat() {
        println("Рысь ест $food")
    }

    override fun roam() {
        println("Среда обитания рыси - $habitat")
    }
}