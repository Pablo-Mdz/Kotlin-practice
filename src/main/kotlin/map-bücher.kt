fun main() {

    val buchList : MutableMap<String, Int> = mutableMapOf( )

    buchList += mapOf("Mastering Ethereum" to 1, "Internet del dinero" to 2, "Pragmatic Programer" to 3, "Refactoring" to 4)
    buchList["Clean Code"] = 5
    println(buchList)

    buchList.remove("Internet del dinero")

    println("die Lagerbestand von die Büch Pragmatic Programer ist: ${buchList.getValue("Pragmatic Programer")}")

    val listOfValues :List<Int> = buchList.values.toList()
    val listOfKeys :List<String> = buchList.keys.toList()
    println("Diese sind die Lagerbestand des Bücher: $listOfValues")
    println("Diese sind die Titles des Bücher: $listOfKeys")


}