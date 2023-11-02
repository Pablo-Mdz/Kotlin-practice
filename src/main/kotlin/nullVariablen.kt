//TAG 8: Null
//
//nullable Variable erstellen
//Erstelle eine Variable mit ‘null’ vom Datentyp String und printe sie aus
//
//nullable MutableList erstellen
//Erstelle eine leere MutableList mit mit dem Namen ‘Eis’ vom Datentyp String
//Füge der Liste ‘Eis’ deine 5 Lieblings-Eissorten hinzu
//Entferne alle Lieblings-Eissorten aus der Liste
//Printe die Liste ‘Eis’

fun main() {
 var nullVariable : String? = null
    println(nullVariable)

    val eis : MutableList<String?> = mutableListOf(null)
    eis.addAll(listOf("Schocolade","Zitronen","Erdberre", "Orange", "Tramontana"))
    eis.clear()
    println(eis)


}
