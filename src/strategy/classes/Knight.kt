package strategy.classes

import strategy.interfaces.WeaponBehavior

class Knight : Character() {
    override var weaponBehavior: WeaponBehavior = LongSwordBehavior()
}