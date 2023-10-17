import kotlin.random.Random

//Zahlenraten-Spiel (Vorsicht: schwer!)
//
//Schreibe ein Programm in Kotlin, das ein Zahlenraten-Spiel umsetzt. Das Programm soll eine zufällige Zahl zwischen 1 und 100 generieren und den User auffordern, diese Zahl zu erraten. Das Programm sollte die folgenden Schritte umfassen:
//
//Generiere eine zufällige Zahl zwischen 1 und 100.
//(kniffelig: hier musst du selbst recherchieren, wie man in Kotlin eine Zufallszahl generieren und in einer Variable speichern kann. Ist vom Prinzip her ähnlich zu readln())
//Begrüße den User in der Konsole und fordere ihn auf, seinen Namen einzugeben.
//Sprich den User von jetzt an in der Konsole mit seinem Namen an und fordere ihn auf, eine Zahl einzugeben.
//Überprüfe, ob die eingegebene Zahl mit der zuvor generierten Zufallszahl übereinstimmt.
//(Das ist auch sehr knifflig, du musst selbst recherchieren, wie man bedingte Anweisungen schreibt. Die kommen erst später dran)


fun main() {
    println("Hallo! bitte schreibe Sie Ihre Name: ")
    var name = readln()
    println("Willkommen $name, Sie müssen eine Zahl erraten, die ich denke! muss zwischen 1 und 10 liegen ")
    println("Bitte gebe eine Nummer ein: ")
    var num = readln().toInt()
    val numRandom = Random.nextInt(1,10)

    if (num == numRandom){
        println("Die Nummer ist die gleiche, $name du hast es erraten!!")
    } else {
        println("$name, leider die Nummer ist nicht gleich, bitte probiere nochmals.")
    }

}