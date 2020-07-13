package decorator

interface CustomsDecorator : Keyboard {
    override fun getKeyboardDescription(): String
}