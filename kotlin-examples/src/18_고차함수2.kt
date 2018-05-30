package ex18_2


interface Predicate {
    fun test(e: Int): Boolean
}

// fun test(e: Int) : Boolean
//  => (Int) -> Boolean

fun filter(data: List<Int>, pred: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()

    for (e in data) {
        if (pred(e))
            result.add(e)
    }

    return result
}

fun isOdd(e: Int) = e % 2 == 1
fun isEven(e: Int) = e % 2 == 0

fun filterEvens(data: List<Int>) = filter(data, ::isEven)
fun filterOdds(data: List<Int>) = filter(data, ::isOdd)

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evens = filterEvens(list)
    val odds = filterOdds(list)

    println("evens: $evens")
    println("odds: $odds")

    // 무명 객체를 생성해서 전달하는 방법
    /*
    val result = filter(list, object : Predicate {
        override fun test(e: Int) = e >= 5
    })

    println("result: $result")
    */
}
