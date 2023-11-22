

fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )

    println("---------------  A  ----------------")
    println( sesson("Mai"))


    println("---------------  B  ----------------")
    for (monat in monate) {
        val sessonCurrentMonat = sesson(monat)
        println(" der $monat ist im $sessonCurrentMonat")
    }
    var sommer: MutableList<String> = mutableListOf()

    println("---------------  C  ----------------")
    for (monat in monate) {
        if(monat == "Juni" || monat == "Juli" || monat == "August"){
            sommer += monat
        } else continue

    }
    println("die monaten in Sommer sind: $sommer")


    println("---------------  D  ----------------")
    var monatAusserJuniUndSeptember : MutableList<String> = mutableListOf()
    for (monat in monate) {
        if (monat == "Juni" || monat == "September") {
            continue
        } else monatAusserJuniUndSeptember += monat
    }
    println("Diese sind die monaten außer Juni und September: $monatAusserJuniUndSeptember")


    println("---------------  E  ----------------")

    var abMarz : MutableList<String> = mutableListOf()
    for (marz in 2 until  monate.size step 2 ) {
        abMarz += monate[marz]
    }
    println("Die Monate ab März, jeden zweiten Monat, sind: $abMarz")
}




fun sesson(monat: String): String {

    return when (monat) {
        "Januar", "Februar", "Dezember" -> "Winter"
        "März", "April", "Mai" -> "Früling"
        "Juni", "Juli", "August" -> "Sommer"
        "September", "Oktober", "November" -> "Herbst"
        else -> "nicht monate"
    }
}