package strategy.classes

import strategy.interfaces.WeaponBehavior

abstract class Character {

    abstract var weaponBehavior: WeaponBehavior

    fun fight() {
        weaponBehavior.useWeapon()
    }
}