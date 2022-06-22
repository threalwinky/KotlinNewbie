fun main(){
	var firstDice = Dice()
	firstDice.DiceRoll()
}
class Dice(){
	val sides = 6
	fun DiceRoll(){
		val DiceNumber = (1..sides).random()
		println("Dice value is ${DiceNumber}")
	}
}