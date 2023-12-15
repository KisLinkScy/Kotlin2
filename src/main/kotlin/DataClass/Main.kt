package DataClass
fun main() {
    val user1 = User("Alisa", 20)
    val user2 = User("Alisa", 20)


    println(user1)
    println(user1 == user2)
    println(user1.equals(user2))
}