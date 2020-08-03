package SimpleFactory

fun main() {
    val factory = PizzaFactory()
    val dominosPizza = PizzaStore(factory);
    dominosPizza.orderPizza("cheese")
    dominosPizza.orderPizza("pepperoni")
    dominosPizza.orderPizza("Idk, any pizza it's fine")
}