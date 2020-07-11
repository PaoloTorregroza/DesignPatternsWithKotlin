package observer

import observer.classes.Guard
import observer.classes.Villager
import observer.classes.Watchmen

fun main() {
    val whatchmen = Watchmen()
    val guard1 = Guard(whatchmen)
    val villager1 = Villager(whatchmen)

    whatchmen.noEnemySeen()
    whatchmen.enemySeen()
}