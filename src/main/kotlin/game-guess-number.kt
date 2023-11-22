import kotlin.random.Random

fun main() {
    asciiTittle()
    println("Raten Sie die Zahl, die ich denke...")
    game()
}

fun game() {
    try {
        val computerGuess = Random.nextInt(1, 10)
        var counter = 0
        var restOfOportunities = 5

        do {
            println("bitte gebe Sie eine Nummer: ")
            val playerNum = readln().toInt()

            if (computerGuess == playerNum) {
                asciiGewinn()
                println("Du hast ${6 - restOfOportunities} von 5 Chancen genutzt. Herzlichen Glückwunsch!")
            } else if (playerNum < computerGuess) {
                println("Zu klein!")
                counter++
                restOfOportunities--
                println("Du hast noch $restOfOportunities Chancen...")
            } else if (playerNum > computerGuess) {
                println("zu gross!")
                counter++
                restOfOportunities--
                println("Du hast noch $restOfOportunities Chancen...")
            }
            if (restOfOportunities == 0) {
                asciiVerloren()
                println("du hast $counter Chance Benutz.")
            }
        } while (computerGuess != playerNum && restOfOportunities > 0)
    } catch (e: Exception) {
        println("du must nur Nummer benutzen.")
        game()
    }
    println("Kommst du und spiel, wann immer du wollst!")
}

fun asciiTittle() {

    val blue = "\u001B[34m"
    println(
        "$blue   _______..______    __   _______  __       _______    .___  ___.  __  .___________.   .___  ___.  __  .______       __  \n" +
                "    /       ||   _  \\  |  | |   ____||  |     |   ____|   |   \\/   | |  | |           |   |   \\/   | |  | |   _  \\     |  | \n" +
                "   |   (----`|  |_)  | |  | |  |__   |  |     |  |__      |  \\  /  | |  | `---|  |----`   |  \\  /  | |  | |  |_)  |    |  | \n" +
                "    \\   \\    |   ___/  |  | |   __|  |  |     |   __|     |  |\\/|  | |  |     |  |        |  |\\/|  | |  | |      /     |  | \n" +
                ".----)   |   |  |      |  | |  |____ |  `----.|  |____    |  |  |  | |  |     |  |        |  |  |  | |  | |  |\\  \\----.|__| \n" +
                "|_______/    | _|      |__| |_______||_______||_______|   |__|  |__| |__|     |__|        |__|  |__| |__| | _| `._____|(__)"
    )
}

fun asciiGewinn() {
    val cyan = "\u001B[36m"
    val yellow = "\u001B[33m"
    println(
        "$yellow _______   __    __      __    __       ___           _______.___________.     _______  ___________    __    ____  ______   .__   __. .__   __.  _______ .__   __.  __   __  \n" +
                "|       \\ |  |  |  |    |  |  |  |     /   \\         /       |           |    /  _____||   ____\\   \\  /  \\  /   / /  __  \\  |  \\ |  | |  \\ |  | |   ____||  \\ |  | |  | |  | \n" +
                "|  .--.  ||  |  |  |    |  |__|  |    /  ^  \\       |   (----`---|  |----`   |  |  __  |  |__   \\   \\/    \\/   / |  |  |  | |   \\|  | |   \\|  | |  |__   |   \\|  | |  | |  | \n" +
                "|  |  |  ||  |  |  |    |   __   |   /  /_\\  \\       \\   \\       |  |        |  | |_ | |   __|   \\            /  |  |  |  | |  . `  | |  . `  | |   __|  |  . `  | |  | |  | \n" +
                "|  '--'  ||  `--'  |    |  |  |  |  /  _____  \\  .----)   |      |  |        |  |__| | |  |____   \\    /\\    /   |  `--'  | |  |\\   | |  |\\   | |  |____ |  |\\   | |__| |__| \n" +
                "|_______/  \\______/     |__|  |__| /__/     \\__\\ |_______/       |__|         \\______| |_______|   \\__/  \\__/     \\______/  |__| \\__| |__| \\__| |_______||__| \\__| (__) (__)"
    )
}

fun asciiVerloren() {
    val red = "\u001B[31m"
    println(
        "$red                                                                         \n" +
                "                                                                         \n" +
                "  ▄████  ▄▄▄       ███▄ ▄███▓▓█████     ▒█████   ██▒   █▓▓█████  ██▀███  \n" +
                " ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    ▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒\n" +
                "▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      ▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒\n" +
                "░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    ▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  \n" +
                "░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   ░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒\n" +
                " ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   ░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░\n" +
                "  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░     ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░\n" +
                "░ ░   ░   ░   ▒   ░      ░      ░      ░ ░ ░ ▒       ░░     ░     ░░   ░ \n" +
                "      ░       ░  ░       ░      ░  ░       ░ ░        ░     ░  ░   ░     \n" +
                "                                                     ░                  "
    )
}
