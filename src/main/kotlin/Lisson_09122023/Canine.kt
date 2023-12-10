package Lisson_09122023

open class Canine : Anymal(){
    override var image = "canine.jpg"
    override val food = "из помойки"
    override val habitat = "улица"

    override fun makeNoise(){
        println("Гав")
    }

    override fun eat(){
        println("Собака ест $food")
    }

    override fun roam() {
        println("Среда обитания собаки - $habitat")
    }
}