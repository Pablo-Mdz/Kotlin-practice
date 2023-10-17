fun main() {
    //Schreibe hier deinen Code

    println("Ich werde Ihnen einige Fragen stellen ...")
    println("Wie heiß du? (bitte confirm mit ENTER)")
    var name = readln()

    println("Willkommen $name!")
    println("wie alt bist du? (bitte confirm mit ENTER)")
    var alt = readln()
    println("richtig? $alt?  du bis sehr alt $name... ")
    println("Jetzt addieren wir zwei Zahlen! ")

    println("Können Sie jetzt eine Nummer nennen? ")
    var nummer1 = readln().toInt()
    println("jetzt andere nummer bitte? ")
    var nummer2 = readln().toInt()
    var nummerResult = nummer1 + nummer2
    println("die summe auf beides Nummer sind: $nummerResult")
}

