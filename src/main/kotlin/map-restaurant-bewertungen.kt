//Challenge: Bewertung von Restaurants
//Erstelle eine Map, die Restaurant-Bewertungen speichert. Die Schlüssel der Map sollen die Namen der Restaurants sein und die Werte sollen Listen von Bewertungen sein. Füge vier Restaurants hinzu und fülle ihre Bewertungslisten mit je drei Bewertungen (auf einer Skala von 1 bis 5). Gib anschließend den Durchschnitt der Bewertungen eines bestimmten Restaurants aus.

fun main() {

    val bulliBewertung : MutableList<Int> = mutableListOf(5,10,9)
    val fireBewertung : MutableList<Int> = mutableListOf(3,8,9)
    val goaBewertung : MutableList<Int> = mutableListOf(4,9,9)
    val terraseBewertung : MutableList<Int> = mutableListOf(3,6,5)

    val restaurantBewertungen : Map <String,List<Int>> = mapOf(
        "El Bulli" to bulliBewertung,
        "Fire" to fireBewertung,
        "Goa" to goaBewertung,
        "Terrase" to terraseBewertung
    )

    val averageBulli : Int = (bulliBewertung[0] + bulliBewertung[1]+bulliBewertung[2]) /3
    val averageFire : Int = (fireBewertung[0] + fireBewertung[1]+fireBewertung[2]) /3
    val averageGoa : Int = (goaBewertung[0] + goaBewertung[1]+goaBewertung[2]) /3
    val averageTerrase : Int = (terraseBewertung[0] + terraseBewertung[1]+terraseBewertung[2]) /3

    println("die Liste von der Restaurantes sind: $restaurantBewertungen\n" +
            "Der Durchschnitt für das Restaurant Bulli liegt bei: $averageBulli \n" +
            "Der Durchschnitt für das Restaurant Fire liegt bei: $averageFire \n" +
            "Der Durchschnitt für das Restaurant Goa liegt bei: $averageGoa \n" +
            "Der Durchschnitt für das Restaurant Terrase liegt bei: $averageTerrase  \n")

}