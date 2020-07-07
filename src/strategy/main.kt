import strategy.classes.King
import strategy.classes.Knight
import strategy.classes.Queen
import strategy.classes.Troll

fun main() {
	val Cleopatra = Queen()
	println("Cleopatra is a queen")
	Cleopatra.fight();

	val Enrique = King()
	println("Enrique is a king")
	Enrique.fight()

	val Matislandia = Troll()
	println("Matislandia is a troll")
	Matislandia.fight()

	val InskyLordOfVodka = Knight();
	println("Insky Lord of Vodka is a knight")
	InskyLordOfVodka.fight()
}
