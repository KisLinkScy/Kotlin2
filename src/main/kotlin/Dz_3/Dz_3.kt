package Dz_3

fun main(args: Array<String>) {
    println("Задание №3")
    val firemen = arrayOf("Pugh", "Pugh", "Darney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemenNo = 0

    while (firemenNo < 6) {
        println("Firemen number $firemenNo is ${firemen[firemenNo]}")
        firemenNo += 1
    }
}