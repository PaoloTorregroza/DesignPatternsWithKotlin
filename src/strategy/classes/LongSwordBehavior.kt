package strategy.classes

import strategy.interfaces.WeaponBehavior

class LongSwordBehavior : WeaponBehavior {
    override fun useWeapon() {
        super.useWeapon()
        println("and it is a longsword!\n")
    }
}