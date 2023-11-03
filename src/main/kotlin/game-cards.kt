/*
In der Variable cards ist ein Kartenset in Form einer Liste gespeichert.
Beispiel:
    "♥️7" steht für die Karte "Herz Sieben"
    "♥️A" steht für die Karte "Herz Ass"
 */
val cards: MutableList<String> = mutableListOf(
    "♥️7", "♦️7", "♠️7", "♣️7",
    "♥️8", "♦️8", "♠️8", "♣️8",
    "♥️9", "♦️9", "♠️9", "♣️9",
    "♥️10", "♦️10", "♠️10", "♣️10",
    "♥️B", "♦️B", "♠️B", "♣️B",
    "♥️D", "♦️D", "♠️D", "♣️D",
    "♥️K", "♦️K", "♠️K", "♣️K",
    "♥️A", "♦️A", "♠️A", "♣️A",
    "🃏JOKER"
)

/*
In der Variable values sind die Werte der Karten in einer Map gespeichert.
Beispiel:
    "♥️7" to 1 steht für einen Wert von 1 für die Karte "Herz Sieben"
    "♥️A" to 8 steht für einen Wert von 8 für die Karte "Herz Ass"
Bei einem Vergleich der Werte würde also das "Herz Ass" gewinnen
 */
val cardValues: Map<String, Int> = mapOf(
    "♥️7" to 1, "♦️7" to 1, "♠️7" to 1, "♣️7" to 1,
    "♥️8" to 2, "♦️8" to 2, "♠️8" to 2, "♣️8" to 2,
    "♥️9" to 3, "♦️9" to 3, "♠️9" to 3, "♣️9" to 3,
    "♥️10" to 4, "♦️10" to 4, "♠️10" to 4, "♣️10" to 4,
    "♥️B" to 5, "♦️B" to 5, "♠️B" to 5, "♣️B" to 5,
    "♥️D" to 6, "♦️D" to 6, "♠️D" to 6, "♣️D" to 6,
    "♥️K" to 7, "♦️K" to 7, "♠️K" to 7, "♣️K" to 7,
    "♥️A" to 8, "♦️A" to 8, "♠️A" to 8, "♣️A" to 8,
    "🃏JOKER" to 10
)
fun main() {
    // TODO: Schreibe hier deinen Code
    cards.shuffle()
    println(" Das sind die Spielkarten: $cards")
    println("----------------------------------")
    println("Spieler 1, bitte gib deinen Namen ein: ")
    val spieler1 :String = readln()
    println("Spieler 2, bitte gib deinen Namen ein: ")
    val spieler2 :String = readln()

    val carteSpieler1 : MutableList < String>  = mutableListOf()
    val carteSpieler2 : MutableList < String>  = mutableListOf()
    //delete from cards and add to each player
    println("$spieler1 zieht eine Karte...")
    var deleteCarte1 : String = cards.removeFirst()
    carteSpieler1.add(deleteCarte1)

    println("$spieler2 zieht eine Karte...")
    var deleteCarte2 : String = cards.removeFirst()
    carteSpieler2.add(deleteCarte2)

    println("$spieler1 zieht eine Karte...")
    var deleteCarte3 : String = cards.removeFirst()
    carteSpieler1.add(deleteCarte3)

    println("$spieler2 zieht eine Karte...")
    var deleteCarte4 : String = cards.removeFirst()
    carteSpieler2.add(deleteCarte4)

    println("$spieler1 zieht eine Karte...")
    var deleteCarte5 : String = cards.removeFirst()
    carteSpieler1.add(deleteCarte5)

    println("$spieler2 zieht eine Karte...")
    var deleteCarte6 : String = cards.removeFirst()
    carteSpieler2.add(deleteCarte6)

    println("$spieler1's Karten: $carteSpieler1")
    println("$spieler2's Karten: $carteSpieler2")
    println("----------------------------------")

    val randomIndex1 = (0 until carteSpieler2.size).random()
    val takeKarteFromSpieler1To2 : String = carteSpieler2.removeAt(randomIndex1)
    val randomIndex2 = (0 until carteSpieler2.size).random()
    val takeKarteFromSpieler2To1 : String = carteSpieler1.removeAt(randomIndex2)

    println("$spieler2 hat die Karte $takeKarteFromSpieler2To1 von $spieler1 gestohlen")
    carteSpieler1.add(takeKarteFromSpieler1To2)
    println("$spieler1 hat die Karte $takeKarteFromSpieler1To2 von $spieler2 gestohlen")
    carteSpieler2.add(takeKarteFromSpieler2To1)
    println("----------------------------------")
    println("$spieler1 Karten: $carteSpieler1")
    println("$spieler2 Karten: $carteSpieler2")

    println("$spieler1, wirf eine Karte ab! Welche willst du abwerfen? 1 ,2 oder 3?")
    val zweiteKarteWerfelnSpieler1 : Int = readln().toInt()-1
    val deleteCard7:String = cards.removeFirst()
    carteSpieler1.add(deleteCard7)

    println("$spieler2, wirf eine Karte ab! Welche willst du abwerfen? 1 ,2 oder 3?")
    val zweiteKarteWerfelnSpieler2 : Int = readln().toInt()-1
    val deleteCard8:String = cards.removeFirst()
    carteSpieler2.add(deleteCard8)

    println("----------------------------------")
    println("$spieler1 hat die Karte ${carteSpieler1[zweiteKarteWerfelnSpieler1]} abgeworfen und die Karte $deleteCard7 gezogen")
    carteSpieler1.removeAt(zweiteKarteWerfelnSpieler1)
    println("$spieler2 hat die Karte ${carteSpieler2[zweiteKarteWerfelnSpieler2]} abgeworfen und die Karte $deleteCard8 gezogen")
    carteSpieler2.removeAt(zweiteKarteWerfelnSpieler2)

    println("----------------------------------")
    val totalValueSpieler1 = carteSpieler1.map { cardValues.getOrDefault(it, 0) }.sum()
    val totalValueSpieler2 = carteSpieler2.map { cardValues.getOrDefault(it, 0) }.sum()
    val hoherCard = carteSpieler1.maxBy { cardValues[it]!! }
    val hoherCard2 = carteSpieler2.maxBy { cardValues[it]!! }

    println("Die höchste Karte von $spieler1 ist: $hoherCard")
    println("Die höchste Karte von $spieler2 ist: $hoherCard2")
    println("$spieler1 Karten $carteSpieler1 haben einen Wert von: $totalValueSpieler1")
    println("$spieler2 Karten $carteSpieler2 haben einen Wert von: $totalValueSpieler2")

    println("----------------------------------")
    println("das bedeutet dass...🥁")

    if (totalValueSpieler1 > totalValueSpieler2) {
        println("Der Gewinner ist $spieler1 mit $totalValueSpieler1 Punkten!!!")
    } else if (totalValueSpieler1 < totalValueSpieler2) {
        println("Der Gewinner ist $spieler2 mit $totalValueSpieler2 Punkten!!!")
    } else {
        println("Die beiden Spieler waren unentschieden con $totalValueSpieler1 Punkten!!!")
    }

}
