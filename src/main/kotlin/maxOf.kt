fun main() {
    println("Dieses Programm erkennt die größte Zahl unter den drei, die Sie mir nennen. Bitte fügen Sie eine Zahl hinzu: ")
    var num1 : Int = readln().toInt()
    println("Fügen Sie nun eine weitere Nummer hinzu: ")
    var num2 : Int = readln().toInt()
    println("Fügen Sie die lastest Nummer hinzu: ")
    var num3 : Int = readln().toInt()

    println("die hoche Nummer ist: ${maxOf( num1, num2 , num3)}")
}

