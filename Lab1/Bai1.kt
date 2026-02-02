fun main() {
    println("Hello, world!")
    println("This is the text to print!")

    val age = "5"
    val name = "Rover"
    var roll = 6
    var rolledValue: Int = 4

    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")

    val num = 4
    if (num > 4) println("Greater than 4")
    else if (num == 4) println("Equal to 4")
    else println("Less than 4")

    printHello()
    printBorder("=", 20)

    val result = rollDice()
    println(result)

    when (result) {
        3 -> println("You won!")
        else -> println("Try again")
    }

    val dice = Dice(6)
    println(dice.roll())
}

fun printHello() {
    println("Hello Kotlin")
}

fun printBorder(border: String, times: Int) {
    repeat(times) { print(border) }
    println()
}

fun rollDice(): Int = (1..6).random()

class Dice(val sides: Int) {
    fun roll(): Int = (1..sides).random()
}
