package YababaDab

fun main(args: Array<String>) {
    var x = 1;

    while (x < 3){
        print(if (x == 1) "Yab" else "ba" )
        x +=1
    }
    print("Dab")
    if (x == 3) println("Do")
}