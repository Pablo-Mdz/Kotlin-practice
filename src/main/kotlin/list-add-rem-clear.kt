//Add, Remove, & Clear
//Erstelle eine leere MutableList namens myList.
//Füge die Elemente "Apple", "Banana" und "Orange" in beliebiger Reihenfolge zur Liste hinzu.
//Füge das Element "Grape" am Anfang der Liste ein.
//Entferne das Element "Banana" aus der Liste.
//Leere die Liste mit der Methode clear().
//Gib die aktuelle Liste aus.


fun main() {
val myList : MutableList <String> = mutableListOf( )
    myList.add("Apple")
    myList.add("Banana")
    myList.add("Orange")
    myList.add(0,"Grape")
    myList.remove("Banana")
    myList.clear()
    println(myList)
}