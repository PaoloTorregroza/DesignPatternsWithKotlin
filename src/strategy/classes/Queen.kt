package strategy.classes

import strategy.interfaces.WeaponBehavior

class Queen : Character() {
    override var weaponBehavior: WeaponBehavior = KnifeBehavior()
}