package SimpleFactory

class PizzaStore(private val factory: PizzaFactory) {
    fun orderPizza(type: String) {
        val pizza = factory.createPizza(type)
        pizza.serve()
    }
}