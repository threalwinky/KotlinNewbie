import kotlin.math.PI
fun main() {
    var squarecabin = squareCabin(6, 50.0)
    printInfor(squarecabin)
    var roundhut = roundHut(2, 10.0)
    printInfor(roundhut)
    var roundtower = roundTower(3,  15.5)
    printInfor(roundtower)
}

fun printInfor(name : Dwelling){
    with (name){
        println(name.toString().uppercase())
        println("============")
        println("Building material : ${buildingMaterial}")
        println("Capacity is ${capacity}")
        println("Has room : ${hasRoom()}")
        println("Floor area : ${floorArea()}\n")
    }
}
abstract class Dwelling(private var residents: Int){
    abstract var buildingMaterial : String
    abstract var capacity : Int
    fun hasRoom() : Boolean{
        return residents < capacity
    }
    abstract fun floorArea() : Double
}
class squareCabin(residents : Int, val length: Double) : Dwelling(residents){
    override var buildingMaterial = "Wood"
    override var capacity = 6
    override fun floorArea(): Double{
        return length*length
    }
}a
open class roundHut(residents : Int, val radius : Double) : Dwelling(residents){
    override var buildingMaterial = "Straw"
    override var capacity = 4
    override fun floorArea(): Double{
        return radius*radius*PI
    }
}
class roundTower(residents : Int, radius : Double, val floors: Int = 2) : roundHut(residents, radius){
    override var buildingMaterial = "Stone"
    override var capacity = 4*floors
    override fun floorArea(): Double{
        return super.radius*radius*PI*floors
    }
}