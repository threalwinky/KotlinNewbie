fun main() {
    var squarecabin = squareCabin(3)
    printInfor(squarecabin)
    var roundhut = roundHut(2)
    printInfor(roundhut)
    var roundtower = roundTower(3, 5)
    printInfor(roundtower)
}

fun printInfor(name : Dwelling){
    with (name){
        println(name.toString().uppercase())
        println("============")
        println("Building material : ${buildingMaterial}")
        println("Capacity is ${capacity}")
        println("Has room : ${hasRoom()}\n")
    }
}
abstract class Dwelling(private var residents: Int){
    abstract var buildingMaterial : String
    abstract var capacity : Int
    fun hasRoom() : Boolean{
        return residents < capacity
    }
}
class squareCabin(residents : Int) : Dwelling(residents){
    override var buildingMaterial = "Wood"
    override var capacity = 6
}
open class roundHut(residents : Int) : Dwelling(residents){
    override var buildingMaterial = "Straw"
    override var capacity = 4
}
class roundTower(residents : Int, val floors: Int) : roundHut(residents){
    override var buildingMaterial = "Stone"
    override var capacity = 4*floors
}