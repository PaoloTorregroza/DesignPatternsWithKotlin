package observer.classes

import observer.interfaces.Action
import observer.interfaces.Observer
import observer.interfaces.Subject

class Villager(watchmen: Subject) : Observer, Action {
    private var attack: Boolean = false

    // We subscribe it to the observer inside the constructor
    init {
        watchmen.registerObserver(this)
    }

    override fun update(attack: Boolean) {
        this.attack = attack
        takeAction()
    }

    override fun takeAction() {
        if (this.attack) {
            println("Villager: Ruuuuuuuun!!!!! DRAGON IN COMING!")
        } else {
            println("Villager: Tururururu collecting carrots")
        }
    }
}