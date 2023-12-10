package Lisson_09122023

class Fox : Anymal() {
    override var image = "Fox.jpg"
    override val food = "Зайцев"
    override val habitat = "Лес"

    override fun makeNoise() {
        println("Тяфканье")
    }

    override fun eat() {
        println("Лиса ест $food")
    }

    override fun roam() {
        println("Среда обитания лисы - $habitat")
    }
}