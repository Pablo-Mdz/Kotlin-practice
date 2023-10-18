fun main() {
    println("Heute werden wir arithmetische Operationen durchführen! ")
    println("Bitte fügen Sie eine Nummer hinzu")
    var num1 : Int = readln().toInt()
    println("Fügen Sie nun eine weitere Nummer hinzu ")
    var num2 : Int = readln().toInt()
    var susatz = num1 + num2
    var substraktion = num1 - num2
    var aufteilung = num1 / num2
    var multiplikation = num1 * num2



    println("Die Ergebnisse sind:\n" +
            "Zusatz: $susatz\n" +
            "Subtraktion: $substraktion\n" +
            "Aufteilung: $aufteilung\n" +
            "Multiplikation: $multiplikation")
}