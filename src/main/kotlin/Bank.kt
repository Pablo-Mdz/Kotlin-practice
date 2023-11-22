import java.util.stream.Stream


/**
 * Eine globale Konstante vom Typ MutableMap<String, Double>, die alle Konten in der Bank repräsentiert.
 *
 * Jedes Konto besteht aus dem Namen des Kontoinhabers und dem Kontostand.
 * Der Name des Kontoinhabers dient als Schlüssel (Key) und der Kontostand als Wert (Value).
 *
 * Beispiel für ein Eintragspaar:
 * "Nadja" -> 1000.22
 */
val usersMap: MutableMap<String, Double> = mutableMapOf(
    "Nadja" to 1000.22,
    "Anin" to 500.44,
    "Alejandro" to 700.57,
    "Sebina" to 2000.5,
    "Marius" to 100.40
)
val passwordUsers: MutableMap<String, String> = mutableMapOf(
    "Nadja" to "1234",
    "Anin" to "1234",
    "Alejandro" to "1234",
    "Sebina" to "1234",
    "Marius" to "1234"
)


fun main() {
    home()
}

fun home() {
    logIn()

}
/**
 * Zeigt ein Menü mit verschiedenen Optionen für die Bankkontenverwaltung an.
 *
 * Erlaubt dem Benutzer die Auswahl verschiedener Aktionen wie das Anzeigen aller Kunden,
 * Details eines Kontos, Hinzufügen eines neuen Kontos, Löschen eines Kontos,
 * Überweisungen zwischen Konten und Geldabhebungen.
 */

fun menu() {
    println(
        """Please select your option: 
        1 - See all clients
        2 - Details of your Konto
        3- Add a new client
        4- Delete account
        5- Transfer from accounts
        6- Extract
        7- annual Clousure
        8- exit
    """.trimMargin()
    )
    val option: Int = readln().toInt()

    when (option) {
        1 -> {
            println(usersMap)
            println("######################################")

            menu()
        }

        2 -> detailsKonto()
        3 -> newKonto()
        4 -> deleteKonto()
        5 -> TransferFromAccounts()
        6 -> extractMoney()
        7 -> annualClosure()
        8 -> logOut()
        else -> {
            println("please select only one of the items in the menu")
            menu()
        }
    }
}

fun logIn() {
    try {
        ascii()
        println(
            "Please enter your user Name to Log in: "
        )
        val name: String = readln().capitalize()
        println("password: ")
        val pass: String = readln()

        if (passwordUsers.containsKey(name) && passwordUsers[name] == pass) {
            println("Login successful.")
            menu()
        } else {
            println("Invalid username or password.")
            logIn()
        }
    } catch (e: Exception) {
        println("An error occurred: ${e.message}")
    }
}

fun logOut() {
    home()
}


/**
 * Gibt den aktuellen Kontostand eines Kontos zurück.
 *
 * Nimmt den Namen des Kontoinhabers als Parameter und gibt den aktuellen Kontostand zurück.
 * Wenn das Konto in der Bank nicht existiert, wird eine entsprechende Fehlermeldung ausgegeben.
 *
 * @param name Der Name des Kontoinhabers.
 * @return Der aktuelle Kontostand des Kontos.
 */
fun returnPreis(name: String): Double {
    val value = usersMap[name]
    return value ?: throw Exception("Konto $name doesn't exist")
}

/**
 * Zeigt die Details eines spezifischen Kontos an.
 *
 * Fordert den Benutzer auf, den Namen des Kontoinhabers einzugeben und zeigt den aktuellen Kontostand dieses Kontos an.
 */
fun detailsKonto() {
    val listName: MutableSet<String> = usersMap.keys
    println("select your Konto: \n $listName")
    val myKonto = readln().capitalize()

    try {
        if (usersMap.containsKey(myKonto)) {
            println("the amount of $myKonto is: ")
            println(returnPreis(myKonto))
            println("######################################")
        } else {
            println("The name doesn't exist in our bank, please try again.")
            home()
        }
    } catch (e: Exception) {
        println(e.message)
    }
    menu()
}


/**
 * Ermöglicht das Erstellen eines neuen Kontos.
 *
 * Fordert den Benutzer auf, einen neuen Benutzernamen und einen Anfangskontostand anzugeben.
 * Fügt das neue Konto zur Kontenliste hinzu.
 */
fun newKonto() {
    println(" If you want to create a new account. \n Please give us an Username: ")
    val newName = readln().capitalize()

    try {

        when (newName) {
            in usersMap -> {
                println("this user is already taken, please try again")
                newKonto()
            }

            else -> {
                println("hoy much money do you want to save with us?: ")
                val newMoney: Double = readln().toDouble()
                usersMap[newName] = newMoney
                println(
                    "The Account is successful created!. \n" +
                            "Konto Name: $newName \n" +
                            "Amount: $newMoney"
                )
                println("all the user now are: $usersMap")
                println("######################################")

            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
    menu()
}

/**
 * Ermöglicht das Löschen eines Kontos.
 *
 * Fordert den Benutzer auf, den Namen des zu löschenden Kontos anzugeben.
 * Entfernt das Konto aus der Liste, wenn es gefunden wird.
 */
fun deleteKonto() {
    println("Please select the name of account that you want to delete: ")
    println()
    val deleteName = readln().capitalize()
    when {
        deleteName in usersMap -> {
            usersMap.remove(deleteName)
            println("Account $deleteName has been deleted.")
            println("######################################")
            menu()
        }

        else -> {
            println("account not found")
            menu()
        }
    }
}


/**
 * Ermöglicht Überweisungen zwischen Konten.
 *
 * Fordert den Benutzer auf, Sender, Empfänger und den zu überweisenden Betrag anzugeben.
 * Aktualisiert die Kontostände entsprechend der Überweisung.
 */

fun TransferFromAccounts() {
    val listName: MutableSet<String> = usersMap.keys
    println(
        "Select your user: \n" +
                " $listName"
    )
    val sender = readln().capitalize()

    println("Who do you want to send money to? ")
    println(
        "Select the reciever name: \n" +
                " $listName"
    )
    val reciever = readln().capitalize()
    if (!listName.contains(sender) || !listName.contains(reciever)) {
        println("User or sender didn't found, please try again.")
        menu()
    }

    println("$sender how much money do you want to send to $reciever?: ")
    val money: Int = readln().toInt()

    try {
        if (usersMap[sender]!! >= money) {
            usersMap[sender] = usersMap[sender]!! - money
            usersMap[reciever] = usersMap[reciever]!! + money
            println("transaction complete, $money euros trasfferred from $sender to $reciever")
            println("######################################")
            menu()
        } else {
            println("Insufficient founds.")
            menu()
        }
    } catch (e: Exception) {
        println(e.message)
    }
}

/**
 * Ermöglicht es dem Benutzer, Geld von seinem Konto abzuheben.
 *
 * Fordert den Benutzer auf, den Namen des Kontos und den abzuhebenden Betrag anzugeben.
 * Überprüft die Möglichkeit der Abhebung und aktualisiert den Kontostand.
 */
fun extractMoney() {
    val listName: MutableSet<String> = usersMap.keys
    println(
        "Select your user: \n" +
                " $listName"
    )
    val user = readln().capitalize()
    println("hoy much money do you want to extract?: ")
    val money: Int = readln().toInt()

    try {
        if (!listName.contains(user)) {
            println("User didn't found, please try again.")
            println("######################################")

            menu()
        } else if (money >= 500) {
            println("you can not extract more than 500 euros.")
            println("######################################")

            menu()
        } else if (money <= usersMap[user]!!) {
            usersMap[user] = usersMap[user]!! - money
            println("your actual amount is ${usersMap[user]} euros")
            println("######################################")

            menu()
        } else if (money > usersMap[user]!!) {
            println("you don't have enough founds.")
            println("######################################")
            menu()
        }
    } catch (e: Exception) {
        println(e.message)
    }
}

val interestRate = 0.01
val maintenanceFee = 0.99

/**
 * Berechnet den Jahresabschluss für ein gegebenes Konto.
 *
 * Zieht zuerst die Kontoführungskosten ab und erhöht dann den Kontostand um den Zinssatz der Bank.
 * Wenn ein Kunde nicht genügend Geld hat, um die Kosten zu bezahlen, wird sein Konto geschlossen.
 * D.h. das Konto wird aus der MutableMap gelöscht und es wird eine Nachricht in der Konsole ausgegeben.
 *
 * @param name Der Name des Kontoinhabers.
 * @throws Exception Wenn das Konto nicht existiert oder wenn der Krontostand für die Kosten nicht ausreicht.
 */
fun annualClosure() {
    val listName: MutableSet<String> = usersMap.keys
    println("select your Konto: \n $listName")
    val name = readln().capitalize()
    val currentBalance = usersMap[name]
    if (currentBalance != null) {
        if (currentBalance >= maintenanceFee) {
            val newBalance = (currentBalance - maintenanceFee) * (1 + interestRate)
            usersMap[name] = newBalance
            println("your new balance is $newBalance")
            println("######################################")

            menu()
        } else {
            usersMap.remove(name)
            println("The account of $name has been closed due to insufficient funds.")
            println("######################################")
            menu()
        }
    } else {
        println("The account $name does not exist.")
        println("######################################")
        menu()
    }
}

fun ascii() {
    val rot = "\u001B[31m"
    val welcome =
        "$rot                                                                                                                  \n" +
                "#  #  # ###### #       ####   ####  #    # ######    #####  ####     ##### #    # ######    #####    ##   #    # #    # ### \n" +
                "#  #  # #      #      #    # #    # ##  ## #           #   #    #      #   #    # #         #    #  #  #  ##   # #   #  ### \n" +
                "#  #  # #####  #      #      #    # # ## # #####       #   #    #      #   ###### #####     #####  #    # # #  # ####    #  \n" +
                "#  #  # #      #      #      #    # #    # #           #   #    #      #   #    # #         #    # ###### #  # # #  #       \n" +
                "#  #  # #      #      #    # #    # #    # #           #   #    #      #   #    # #         #    # #    # #   ## #   #  ### \n" +
                " ## ##  ###### ######  ####   ####  #    # ######      #    ####       #   #    # ######    #####  #    # #    # #    # ### \n" +
                "                                                                                                                            \n"

    println(welcome)

}