package decorator


fun main() {
    var paolinskyKeyboard: Keyboard = WoodCase()
    paolinskyKeyboard = BrownSwitch(paolinskyKeyboard)
    paolinskyKeyboard = pbtKeycaps(paolinskyKeyboard)
    println("Paolinsky keyboard")
    println(paolinskyKeyboard.getKeyboardDescription()
            + " $" + paolinskyKeyboard.cost())

    var loreKeyboard: Keyboard = PlasticCase()
    loreKeyboard = RedSwitch(loreKeyboard)
    loreKeyboard = absKeycaps(loreKeyboard)
    println("Lore keyboard")
    println(loreKeyboard.getKeyboardDescription()
            + " $" + loreKeyboard.cost())
}