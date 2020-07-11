package observer.classes

import observer.interfaces.Observer
import observer.interfaces.Subject

class Watchmen : Subject {
    private var observers = mutableListOf<Observer>()
    private var attack: Boolean = true

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        observers.removeAt(i)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(this.attack)
        }
    }

    fun enemySeen() {
        this.attack = true
        notifyObservers()
    }

    fun noEnemySeen() {
        this.attack = false
        notifyObservers()
    }
}