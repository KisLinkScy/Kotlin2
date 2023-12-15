package Equals

fun main () {
    val book1 = Book("Руслан и Людмила", "А.С. Пушкин", 1820)
    val book2 = Book("Руслан и Людмила", "А.С. Пушкин", 1820)
    val book3 = Book("Руслан и Людмила", "А.С. Пушкин", 182)

    val student1 = Student(1, "Сергей", "магистратура 2 курс")
    val student2 = Student(1, "Сергей", "магистратура 2 курс")
    val student3 = Student(1, "Сергей", "магистратура 3 курс")

    val employee1 = Employee(2, "Зигмунд", "3 отделение")
    val employee2 = Employee(2, "Зигмунд", "3 отделение")
    val employee3 = Employee(2, "Алексей", "3 отделение")

    val product1 = Product(1357, "Сок ягодный", 75.90)
    val product2 = Product(1357, "Сок ягодный", 75.90)
    val product3 = Product(4581, "Сахарный песок", 110.50)

    val room1 = HotelRoom(2114, "ВИП", 10000.0)
    val room2 = HotelRoom(2114, "ВИП", 10000.0)
    val room3 = HotelRoom(1111, "ВИП", 170000.0)

    fun Equality(a: Any, b: Any) {
        println("___________________________________________________________________________")
        println(a.toString())
        println(b.toString())
        println(a == b)
        println(a.equals(b))
    }

    Equality(book1, book2)
    Equality(book2, book3)

    Equality(student1, student2)
    Equality(student2, student3)

    Equality(employee1, employee2)
    Equality(employee2, employee3)

    Equality(product1, product2)
    Equality(product2, product3)

    Equality(room1, room2)
    Equality(room2, room3)
}