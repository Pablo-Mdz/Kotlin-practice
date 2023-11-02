import kotlin.system.exitProcess

//Challenge: Spieleliste
//Angenommen, du hast eine Liste von Videospielen, die du sortieren und aktualisieren möchtest. Implementiere die folgende Aufgabe:
//
//1. Erstelle eine leere Liste mit dem Namen "spieleListe".
//2. Füge die folgenden Spiele zur Liste hinzu: "Assassin's Creed", "The Legend of Zelda", "Final Fantasy", "Call of Duty" und "Minecraft".
//3. Nach einiger Zeit liegt dir “Assassin's Creed” nicht mehr so richtig, entferne das Spiel mithilfe des Indexes von der Liste.
//4. Ein Freund fragt nach, wie viele Spiele du in deiner Liste hast und ob Minecraft dabei ist. Bereite eine Konsolenausgabe vor, um dies zu überprüfen.
//5. Füge das Spiel "Pokémon" an Indexposition 1 in die Liste ein.
//6. Füge die Spiele "FIFA", "Fortnite" und "Overwatch" am Ende der Liste hinzu.
//7. Mische die Liste durch und finde anschließend die neue Position des Spiels “Call of Duty".
//8. Sortiere die Liste alphabetisch und gebe sie anschließend auf der Konsole aus.
fun main() {

        val spieleListe : MutableList<String> = mutableListOf()

        spieleListe.addAll(listOf("Assassin's Creed", "The Legend of Zelda", "Final Fantasy", "Call of Duty", "Minecraft"))

        spieleListe.remove("Assassin's Creed")
        println("Ich habe ${spieleListe.size} spielen")
        spieleListe.add(1,"Pokémon")
        spieleListe.addAll(listOf( "FIFA", "Fortnite", "Overwatch" ))
        spieleListe.shuffle()
        println("die position von des Spiels 'Call of Duty' ist nummer: ${spieleListe.indexOf("Call of Duty")}")
        spieleListe.sort()
        
        println("Meine Spiele liste ist: $spieleListe")
        
        

}