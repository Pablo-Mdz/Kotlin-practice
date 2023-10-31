//AddAll & RemoveAt
//Erstelle eine leere MutableList namens myList.
//Erstelle eine andere Liste mit den Elementen "Cat", "Dog" und "Rabbit".
//Füge alle Elemente aus der zweiten Liste zur myList hinzu.
//Entferne das Element an Index 1 aus der myList mit der Methode removeAt(index).
//Gib die aktuelle Liste aus.
fun main() {
    val myList: MutableList <String> = mutableListOf()
    val animals : List <String> = listOf("Cat","Dog","Rabbit")
    myList.addAll(animals)
    myList.removeAt(1)
    println(myList)
}