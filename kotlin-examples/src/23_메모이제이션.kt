package ex23

import org.junit.jupiter.api.Test

/*
fun fib(k: Int): Long = when (k) {
    0 -> 1
    1 -> 1
    else -> fib(k - 1) + fib(k - 2)
}
*/

// 메모이제이션: 중복된 계산을 캐시하는 방법
//     => 순수 함수(pure function)
//     => 함수의 입력값이 동일하면 결과도 동일하다.
//     => 참조적 투명성을 가진다.

//     => 동적 계획법(Dynamic Programming)

val cache = mutableMapOf<Int, Long>()
fun fib(k: Int): Long = cache.getOrPut(k) {
    when (k) {
        0 -> 1
        1 -> 1
        else -> fib(k - 1) + fib(k - 2)
    }
}

class FibTest {
    @Test
    fun fib10() {
        fib(10)
    }

    @Test
    fun fib30() {
        fib(30)
    }

    @Test
    fun fib50() {
        fib(50)
    }
}

/*
fun main(args: Array<String>) {
    println(fib(10))
    println(fib(30))
    println(fib(50))
}
*/












