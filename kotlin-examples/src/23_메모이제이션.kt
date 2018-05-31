package ex23

// 메모이제이션

fun fib(k: Int): Long = when (k) {
    0 -> 1
    1 -> 1
    else -> fib(k - 1) + fib(k - 2)
}

fun main(args: Array<String>) {
    println(fib(10))
    println(fib(30))
    println(fib(50))
}