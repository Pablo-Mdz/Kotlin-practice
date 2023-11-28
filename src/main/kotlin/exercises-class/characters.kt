package `exercises-class`

class GameCharacter {
    var name: String
    var hasWeapon: Boolean
    var level: Int
    var height: Double? = null
    var age: Int? = null

    constructor(name: String, hasWeapon: Boolean, level: Int) : this(name, hasWeapon, level, null, null)

    constructor(name: String, hasWeapon: Boolean, level: Int, height: Double?, age: Int?) {
        this.name = name
        this.hasWeapon = hasWeapon
        this.level = level
        this.height = height
        this.age = age
    }
}

fun main() {
    // Hier drunter kannst du coden:

    val character1: GameCharacter = GameCharacter("Eddie", true, 18)
    val character2: GameCharacter = GameCharacter("Eddie", true, 18, 1.80, 18)
    val character3: GameCharacter = GameCharacter("Eddie", true, 18, 1.80, 18)
    val character4: GameCharacter = GameCharacter("Eddie", true, 18, 1.80, 18)
    val character5: GameCharacter = GameCharacter("Anna", false, 28, 1.90,null)
    }
