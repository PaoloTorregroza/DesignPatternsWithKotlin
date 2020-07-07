package strategy.classes

import strategy.interfaces.WeaponBehavior

class AxeBehavior : WeaponBehavior {
    override fun useWeapon() {
        super.useWeapon()
        println("and it is an axe!!\n")
    }
}