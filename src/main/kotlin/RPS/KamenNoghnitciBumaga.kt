package RPS

import java.util.*

object Game {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val choices = arrayOf("", "Камень", "Ножницы", "Бумага")
        while (true) {
            println("Выбери число: 1 - Камень, 2 - Ножницы, 3 - Бумага")
            val userChoice = scanner.nextInt()
            val computerChoice = Random().nextInt(choices.size - 1) + 1

            println("      Твой ход: " + choices[userChoice])
            println("Ход компьютера: " + choices[computerChoice])
            println()
            val result = determineWinner(userChoice, computerChoice)
            when (result) {
                0 -> println("Ничья!")
                1 -> println("Ты выиграл!")
                -1 -> println("Ты проиграл!")
            }
            println()
        }
    }

    private fun determineWinner(userChoice: Int, computerChoice: Int): Any {
        return if (userChoice == computerChoice) {
            0 // It's a tie
        } else when (userChoice) {
            1 -> if (computerChoice == 2) 1 else -1
            2 -> if (computerChoice == 3) 1 else -1
            3 -> if (computerChoice == 1) 1 else -1
            else -> return println("(.)(.))")
        }
    }
}