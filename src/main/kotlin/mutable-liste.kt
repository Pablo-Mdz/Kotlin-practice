//Mutable Listen bearbeiten
//Erstelle ein MutableList von Typ X. Diese soll mindestens drei Elemente haben. Füge dieser Liste noch einmal drei Elemente hinzu.
//Lösche anschließend das Element an Stelle 3 und gib das Element an Stelle 5 aus.
fun main() {
    val gemuseList : MutableList < String> = mutableListOf("kartoffeln", "Karoten","Tomate","Salat","Zuccini")
    gemuseList.add("sußkartoffeln")
    gemuseList.add("Kürbis")
    gemuseList.add("Aubergine")
    gemuseList.removeAt(3)
    println(gemuseList[5])
}