//Challenge: Einkaufen gehen
//Schreibe ein Kotlin-Programm, welches einen Einkauf im Supermarkt simulieren soll.
//Verwende hierzu zwei unterschiedliche Listen: eine für Artikelnamen und eine für den Preis.
//Der Nutzer soll zuerst die Möglichkeit haben, 5 Artikel inkl. deren Preis einzugeben.
//Anschließend geht man an die Kasse und ein Beleg wird in sinnvollem Format auf der Konsole ausgedruckt.


fun main() {

    val listProducts : MutableList<String> = mutableListOf("Zucker","Kaffe" ,"Milch","Brot","Hefemilch","Eier","Avocado","Honing")
    val listPrices : MutableList<Double> = mutableListOf( 1.49,11.99,2.19,0.99,2.49,2.49,0.99,4.99)


    println("dieses sind die products in diese Supermarkt: \n" +
            "1- Zucker : 1,49€\n" +
            "2- Kaffe : 11,99€\n" +
            "3- Milch : 2,19€\n" +
            "4- Brot : 0,99€\n" +
            "5- Hefemilch : 2,49€\n" +
            "6- Eier : 2,49€\n" +
            "7- Avocado : 0,99€\n" +
            "8- Honing : 4,99€\n")

    println("Bitte wählen Sie in Ihrem Warenkorb 5 Produkte mit derselben Nummer aus")
    var product1 : Int = readln().toInt()-1
    var product2 : Int = readln().toInt()-1
    var product3 : Int = readln().toInt()-1
    var product4 : Int = readln().toInt()-1
    var product5 : Int = readln().toInt()-1

    var gesaptPreis : Double = listPrices[product1] + listPrices[product2] + listPrices[product3] + listPrices[product4] + listPrices[product5]
    println("Sie haben folgende Produkte ausgewählt: \n" +
            "${listProducts[product1]}, " +
            "${listProducts[product2]}, " +
            "${listProducts[product3]}, " +
            "${listProducts[product4]}, " +
            "${listProducts[product5]}. \n" +
            "Der Gesamtkaufpreis beträgt: $gesaptPreis€")
}