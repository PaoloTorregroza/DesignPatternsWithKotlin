package SimpleFactory

import SimpleFactory.pizzaStyles.CheesePizza
import SimpleFactory.pizzaStyles.PepperoniPizza

class PizzaFactory {
    fun createPizza(type: String): Pizza {
        if (type.equals("pepperoni")) {
            return PepperoniPizza()
        } else if (type.equals("cheese")) {
            return CheesePizza()
        } else {
            return Pizza()
        }
    }
}