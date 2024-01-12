package Pacient

open class Pacient {
    open var id = 0
    open val surname = ""
    open val name = ""
    open val lastName = ""
    open val address = ""
    open val phone = ""
    open var numberCard = 0
    open val diagnoz = ""

    fun info(){
        println("Пациент $surname '$name' '$lastName' готов к выписке дигноз: '$diagnoz'")
    }
    fun viborka(){
        if("$numberCard".toInt() > 100 && "$numberCard".toInt() < 200)
        println("Пациент $surname '$name' '$lastName', Номер карты: '$numberCard'")
    }
}
