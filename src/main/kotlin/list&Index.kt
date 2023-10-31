//Listen erstellen und Indizieren
//Erstelle eine Liste von Getränken und lass sie auf der Konsole ausgeben.
//Lass den/die Nutzer*in einen Index auswählen und drucke dieses Element mit einer Bestätigung aus (“Du hast ‘getränk’ ausgewählt”)


fun main() {
    val listGetranke: List <String> = listOf("Wasser", "Cola", "Fanta", "Beer", "Sprite")
    val preise : List<Double> = listOf(1.2,2.5,2.4,3.1,2.3)
    println("bitte entscheide für eine Gatränke: ")
    val selected : Int = readln().toInt()

    println("du hast ${listGetranke[selected -1]} entscheiden, die preis ist: ${preise[selected -1]}")
}

