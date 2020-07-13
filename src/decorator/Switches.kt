package decorator

class RedSwitch(private val keyboard: Keyboard) : CustomsDecorator, Keyboard by keyboard {

    override fun getKeyboardDescription(): String {
        return keyboard.getKeyboardDescription() + ", red switches"
    }

    override fun cost(): Double {
        return keyboard.cost() + 15.0
    }
}

class BlueSwitch(private val keyboard: Keyboard) : CustomsDecorator, Keyboard by keyboard {

    override fun getKeyboardDescription(): String {
        return keyboard.getKeyboardDescription() + ", blue switches"
    }

    override fun cost(): Double {
        return keyboard.cost() + 12.5
    }
}

class BrownSwitch(private val keyboard: Keyboard) : CustomsDecorator, Keyboard by keyboard{

    override fun getKeyboardDescription(): String {
        return keyboard.getKeyboardDescription() + ", brown switches"
    }

    override fun cost(): Double {
        return keyboard.cost() + 20.0
    }
}