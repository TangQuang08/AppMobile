fun main() {
    val numbers = listOf(0,3,8,4,0,5,5,8,9,2)
    val setOfNumbers = numbers.toSet()

    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,4,5)
    println(set1.intersect(set2))
    println(set1.union(set2))

    val peopleAges = mutableMapOf(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges["Barbara"] = 42
    peopleAges["Joe"] = 51

    peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println()

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
    println(peopleAges.filter { it.key.length < 4 })

    val words = listOf("about", "acute", "balloon", "best", "brief", "class")
    val filteredWords = words
        .filter { it.startsWith("b", true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)

    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))

    var quantity: Int? = null
    println(quantity ?: 0)
    quantity = 4
    println(quantity ?: 0)
}
