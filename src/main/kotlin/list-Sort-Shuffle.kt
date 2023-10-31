//Sort and Shuffle
//Erstelle eine MutableList namens numbers mit den Zahlen 5, 2, 8, 1, 9.
//Sortiere die Liste in aufsteigender Reihenfolge.
//Gib die sortierte Liste aus.
//Mische die Liste mit der Methode shuffle().
//Gib die gemischte Liste aus.

fun main() {
    val nummers : MutableList <Int> = mutableListOf(5,2,8,1,9,)
    nummers.sort()
    println(nummers)
    nummers.shuffle()
    println(nummers)
}