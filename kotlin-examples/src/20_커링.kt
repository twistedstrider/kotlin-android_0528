package ex20

// 커링(Currying)
//  : 다중 인수를 갖는 함수를 단일 인수를 함수들의 함수열로 바꾸는 것을 의미한다.

// sum(10, 20)      -> 30
//  => sum(10)      -> (Int) -> Int
//            (20)  -> 30

// -> fun sum(a: Int)(b: Int)(c: Int) ; Scala

// 일반 함수


// 1) 함수의 실행을 지연할 수 있다.
// 2) 2개 커링 함수
//fun sum(a: Int): (Int) -> Int = { b ->
//    a + b
//}

// 3) 3개 커링 함수
// sum(10)       : (Int) -> (Int) -> Int
// sum(10)(20)
// sum(30)(20)(30)

//fun sum(a: Int): (Int) -> (Int) -> Int = { b ->
//    { c ->
//        a + b + c
//    }
//}

// 인자가 2개인 함수에 대해서 커링 함수를 생성하는 고차 함수

// (P1, P2) -> R

fun sum(a: Int, b: Int): Int = a + b

fun <P1, P2, R> ((P1, P2) -> R).curried(): (P1) -> (P2) -> R = { p1 ->
    { p2 ->
        this(p1, p2)
    }
}

fun main(args: Array<String>) {
    // val s = sum(10)(20)(30)
    // println("sum: $s")

    // sum(10, 20)
    val curriedSum = ::sum.curried()

    val result = curriedSum(10)(20)
    println("result: $result")
}












