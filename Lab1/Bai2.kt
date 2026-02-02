abstract class Dwelling {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

open class RoundHut(val residents: Int) : Dwelling() {
    override val buildingMaterial = "Straw"
    override fun floorArea(): Double = 50.0
}

class SquareCabin(val capacity: Int, val floors: Int) : Dwelling() {
    override val buildingMaterial = "Wood"
    override fun floorArea(): Double = 20.0 * floors
    fun hasRoom() = capacity > 0
}

fun main() {
    val numbers = listOf(1, 2, 3, 4)
    println(numbers.size)
    println(numbers[0])
    println(listOf("red", "blue").reversed())

    val entrees = mutableListOf<String>()
    entrees.add("spaghetti")
    entrees[0] = "lasagna"
    entrees.remove("lasagna")

    for (e in numbers) println(e)

    var i = 0
    while (i < numbers.size) {
        println(numbers[i])
        i++
    }
}
