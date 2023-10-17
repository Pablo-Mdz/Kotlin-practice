fun main() {
    /* Berechnung des Body-Mass-Index (BMI)

    Schreibe ein Programm in Kotlin, das den Body-Mass-Index (BMI) einer Person berechnet. Der BMI wird anhand des Gewichts und der Körpergröße berechnet. Verwende die folgenden Schritte und überleg dir, welche Datentypen du brauchst:

    Frage den Benutzer nach seinem Namen.
    Sprich den User mit seinem Namen an und frage nach seinem Gewicht in Kilogramm.
    Frage den Benutzer zudem nach seiner Körpergröße in Metern.
    Berechne den BMI mit der Formel: BMI = Gewicht / (Körpergröße * Körpergröße)
    Gib den berechneten BMI aus. */

    println("Lass uns deine Körpermasse berechnen")
    println("Bitte geben Sie Ihr Gewicht (in kg) an")
    var gewicht = readln().toDouble()
    println("jetzt deine Körpergröße (in Zentimetern und nur die Zahl, zum Beispiel: 180)")
    var korpergr = readln().toDouble() / 100
    var result = gewicht / (korpergr * korpergr)

    println("Deine BMI ist : $result")
}