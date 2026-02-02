import kotlinx.coroutines.*

suspend fun getValue(): Double {
    delay(300)
    return 42.0
}

suspend fun processValue() {
    val value = getValue()
}

object DataProviderManager

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main() {

    GlobalScope.launch {
        println(getValue())
    }

    val job: Job = GlobalScope.launch {
        println(getValue())
    }
    job.cancel()

    runBlocking {
        println(getValue())
    }

    runBlocking {
        val deferred = async { getValue() }
        println("Output is ${deferred.await()}")
    }

    try {
        val x = 10 / 0
        println(x)
    } catch (e: Exception) {
        println("Exception caught")
    }

    val direction = Direction.NORTH
    when (direction) {
        Direction.NORTH -> {}
        Direction.SOUTH -> {}
        Direction.WEST -> {}
        Direction.EAST -> {}
    }
}
