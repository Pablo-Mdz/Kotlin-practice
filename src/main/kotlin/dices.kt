fun main() {
    //TODO hier deinen Code
    println("Spieler 1, bitte gib deinen Namen ein: ")
    val player1 = readln().capitalize()
    println("Spieler 2, bitte gib deinen Namen ein: ")
    val player2 = readln().capitalize()

    var dice1 : Int = (1..6).random()
    var dice2 : Int =  (1..6).random()

    println("Spieler $player1 würfelt eine $dice1")
    println("Spieler $player2 würfelt eine $dice2")

    if(dice1 > dice2){
        println("$player1 gewinnt mit $dice1 punkte!")
    } else if (dice2 > dice1){
        println("$player2 gewinnt mit $dice2 punkte!")
    } else {
        println("Beides haben die gleiche nummer: $dice1")
    }
}
//fun main() {
//    val filmListe = listOf<String>(
//        "The Dark Knight",
//        "Indiana Jones",
//        "Die Hard",
//        "John Wick 4",
//        "The Shawshank Redemption",
//        "Schindler's List",
//        "The Godfather",
//        "John Wick 3",
//        "Star Wars",
//        "The Matrix",
//        "Shrek",
//        "The Lord of the Rings",
//        "WHO KILLED CAPTAIN ALEX",
//        "Spiderman",
//    )
//    println("von 1 bis ${filmListe.size }")
//
//    val sublist = filmListe.subList(2,4+1)
//    println(sublist)
//    println("von 1 bis ${sublist.size }")
//}