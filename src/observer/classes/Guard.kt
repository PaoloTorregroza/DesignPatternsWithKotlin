package observer.classes

import observer.interfaces.Action
import observer.interfaces.Observer
import observer.interfaces.Subject

class Guard(watchmen: Subject) : Observer, Action {
    private var attack: Boolean = false;

    init {
        watchmen.registerObserver(this)
    }

    override fun update(attack: Boolean) {
        this.attack = attack
        takeAction()
    }

    override fun takeAction() {

        if(this.attack) {
            println("Guard: Taking weapons and establishing defenses")
        } else {
            println("Guard: Telling a story about arrows in the knee")
        }
    }
}