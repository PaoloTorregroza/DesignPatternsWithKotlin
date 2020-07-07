package strategy.classes

import strategy.interfaces.WeaponBehavior

class KnifeBehavior : WeaponBehavior {
    override fun useWeapon() {
        super.useWeapon()
        println("and it is a knife!\n")
    }
}