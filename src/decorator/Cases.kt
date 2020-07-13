package decorator

class WoodCase : Keyboard {

    override var description: String
        get() = "Wooden case keyboard"
        set(value) {}

    override fun cost(): Double {
        return 45.0
    }
}

class PlasticCase : Keyboard {

    override var description: String
        get() = "Plastic case keyboard"
        set(value) {}

    override fun cost(): Double {
        return 40.0
    }
}