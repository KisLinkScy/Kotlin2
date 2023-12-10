package Lisson_09122023

class Wolf : Anymal() {
    override var image = "wolf.jpg"
    override val food = "мясо"
    override val habitat = "лес"

    override fun makeNoise(){
        println("Вой")
    }

    override fun eat(){
        println("Волк ест $food")
    }

    override fun roam() {
        println("Среда обитания волка - $habitat")
    }
}