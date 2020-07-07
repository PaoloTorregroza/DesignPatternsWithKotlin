package strategy.classes

import strategy.interfaces.WeaponBehavior

class King : Character() {
    override var weaponBehavior: WeaponBehavior = SwordBehavior()
}