//Challenge: Telefonbuch
//Erstelle eine Map, die als Telefonbuch fungiert. Füge vier Einträge hinzu, wobei der Name einer Person der Schlüssel ist und die Telefonnummer der Wert. Gib anschließend die Telefonnummer einer bestimmten Person aus.
//
//

fun main() {

    val telefonNummers: Map<String, Int> = mapOf(
        "Marco" to 1398564,
        "Guillerme" to 34905921,
        "Laura" to 1984322,
        "Sandra" to 1444832
    )

    println("Die TelefonNummer von Guillerme ist: ${telefonNummers.get("Guillerme") } ")

}