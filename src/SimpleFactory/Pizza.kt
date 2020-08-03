package SimpleFactory

open class Pizza {
    open var name = "Pizza"

    fun serve() {
        println("A nice " + name);
    }
}