//Challenge: leckeres Rezept
//Du warst erst kürzlich bei einem Freund. Er hat dieses leckere Essen gekocht. Zum Dahinschmelzen. Du hast ihn direkt nach seinem Rezept gefragt. Er hat dir gesagt:
//
//2 Esslöffel Affenhirn
//1 Packung Zucker
//3 Krähenfüße
//27 Dosen Cola (Ja das gehört auch da rein)
//Speichere die Werte in einer Map (key:“Salz” -> value:“2 Eimer”). Lass dir das Rezept ausgeben.
fun main() {

    val recipe : Map<String,String> = mapOf(
         "Esslöffel Affenhirn" to "2",
         "Packung Zucker" to "1",
         "Krähenfüße" to " 3",
         "Dosen Cola" to "27"
    )
    println("Die Recepte ist: $recipe")
}