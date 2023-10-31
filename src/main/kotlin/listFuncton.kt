fun main() {
//    Listenfunktionen
//    Erstelle eine leere Liste. Füge in diese im Nachhinein deine 5 Lieblingsessen hinein. sortier diese Liste. Misch sie durch. Lösch den letzten Eintrag. Sortier Sie. Lösch den ersten Eintrag. Lass den Rest der Liste ausgeben.
    val lieblingsEssen: MutableList < String> = mutableListOf("Hamburger","Lasagna","Grill Fleich", "Fish","Schnitzel")
    lieblingsEssen.sort()
    lieblingsEssen.shuffle()
    lieblingsEssen.removeAt(lieblingsEssen.size -1)
    lieblingsEssen.sort()
    lieblingsEssen.removeAt(0)
    println(lieblingsEssen)


}