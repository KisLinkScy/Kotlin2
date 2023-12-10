package Lisson_09122023

class Hippo : Anymal() {
    override var image = "hippo.jpg"
    override val food = "растение"
    override val habitat = "вода"

    override fun makeNoise() {
        println("Ворчание")
    }

    override fun eat() {
        println("Гиппопотам ест $food")
    }

    override fun roam() {
        println("Среда обитания гиппопотама - $habitat")
    }
}