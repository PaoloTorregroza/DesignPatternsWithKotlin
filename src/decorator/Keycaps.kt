package decorator

class absKeycaps(private val keyboard: Keyboard) : CustomsDecorator, Keyboard by keyboard {
    override fun cost(): Double {
        return keyboard.cost() + 25.0
    }

    override fun getKeyboardDescription(): String {
        return keyboard.getKeyboardDescription() + ", abs keycaps"
    }
}

class pbtKeycaps(private val keyboard: Keyboard) : CustomsDecorator, Keyboard by keyboard {
    override fun cost(): Double {
        return keyboard.cost() + 40.0
    }

    override fun getKeyboardDescription(): String {
        return keyboard.getKeyboardDescription() + ", pbt keycaps"
    }
}