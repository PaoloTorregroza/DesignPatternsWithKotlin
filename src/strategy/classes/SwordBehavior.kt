package strategy.classes

import strategy.interfaces.WeaponBehavior

class SwordBehavior : WeaponBehavior {
    override fun useWeapon() {
        super.useWeapon()
        println("and it is a sword!!\n")
    }
}