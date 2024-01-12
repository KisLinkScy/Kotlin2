package Pacient

fun main() {
    val a  = 100
    val vipiska = arrayOf(
        Bolnoi_1(),
        Bolnoi_2(),
        Bolnoi_3()
    )
    for(item in vipiska){
        if("${item.diagnoz}" == "Здоров")
            println(item.info())
        println("${item.viborka()}")
    }
}