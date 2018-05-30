package ex20

// 커링(Currying)
//  : 다중 인수를 갖는 함수를 단일 인수를 함수들의 함수열로 바꾸는 것을 의미한다.

// sum(10, 20)      -> 30
//  => sum(10)      -> (Int) -> Int
//            (20)  -> 30

// -> fun sum(a: Int)(b: Int)(c: Int) ; Scala

// 일반 함수
fun sum(a: Int, b: Int): Int = a + b

// 1) 함수의 실행을 지연할 수 있다.
// 2) 2개 커링 함수
fun sum(a: Int): (Int) -> Int = { b ->
    a + b
}

// 3) 3개 커링 함수


fun main(args: Array<String>) {

    val s = sum(10)(20)
    println("sum: $s")
}












