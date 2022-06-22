fun main(){
	var secondDice = Dice1()
	println("Dice value is ${secondDice.DiceRoll()}")
}
class Dice1{
	var sides = 6
	fun DiceRoll() : Int{
		var DiceNumber = (1..sides).random()
		return DiceNumber
	}
}