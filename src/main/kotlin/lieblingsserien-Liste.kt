//Challenge: Lieblingsserien-Liste
//Schreibe ein Kotlin-Programm, das die Benutzer auffordert, ihre Lieblingsserien einzugeben.
//
//Verwende dazu die Funktion readLine().
//Die eingegebenen Serien sollen jeweils in einer MutableList<String> namens favoriteShows gespeichert werden.
//
//
//Nachdem die Benutzer ihre Lieblingsserien eingegeben haben, füge weitere Operationen hinzu, um die favoriteShows-Liste zu manipulieren. Hier sind einige Vorschläge:
//
//- Sortiere die Liste alphabetisch.
//- Entferne doppelte Einträge aus der Liste.
//- Überprüfe, ob eine bestimmte Serie in der Liste enthalten ist.
//- Füge eine neue Serie am Ende der Liste hinzu.
//- Entferne eine bestimmte Serie aus der Liste.
//
//
//Deine Aufgabe ist es, den Code für dieses Programm zu schreiben und sicherzustellen, dass die eingegebenen Lieblingsserien korrekt in der favoriteShows-Liste gespeichert werden. Füge dann die gewünschten Operationen hinzu, um die Liste entsprechend zu manipulieren.
fun main() {
    println("bitte gebe Sie ihre 3 Liblingsseries: ")
    var serie1 : String = readln()
    var serie2 : String = readln()
    var serie3 : String = readln()
    var liblingsFilmList : MutableList<String> = mutableListOf()
    liblingsFilmList.add(serie1)
    liblingsFilmList.add(serie2)
    liblingsFilmList.add(serie3)

    liblingsFilmList.sort()
    liblingsFilmList.distinct()
    liblingsFilmList.contains(serie1)
    liblingsFilmList.add("Game of Thrones")
    liblingsFilmList.removeAt(1)



    println(liblingsFilmList)
}