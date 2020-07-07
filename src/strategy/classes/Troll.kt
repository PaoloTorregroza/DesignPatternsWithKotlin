package strategy.classes

import strategy.interfaces.WeaponBehavior

class Troll : Character() {
    override var weaponBehavior : WeaponBehavior = AxeBehavior()
}