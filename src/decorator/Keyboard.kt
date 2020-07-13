package decorator

interface Keyboard {
    var description: String

    fun getKeyboardDescription(): String {
        return description
    }

    fun cost(): Double
}