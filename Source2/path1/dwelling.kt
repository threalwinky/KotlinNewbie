fun main() {
    
}
abstract class Dwelling(private var residents: Int){
    abstract var buildingMaterial : String
    abstract var capacity : Int
    fun hasRoom() : Boolean{
        return residents < capacity
    }
}