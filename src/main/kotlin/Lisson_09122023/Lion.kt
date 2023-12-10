package Lisson_09122023

class Lion: Anymal() {
    override var image = "Lion.jpg"
    override val food = "Парнокопытных"
    override val habitat = "Саванна"

    override fun makeNoise() {
        println("Рычание")
    }

    override fun eat() {
        println("Лев ест $food")
    }

    override fun roam() {
        println("Среда обитания льва - $habitat")
    }
}