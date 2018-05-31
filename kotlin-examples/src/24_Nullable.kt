package ex24

import java_examples.LambdaExample
import java.util.*

// Nullable - compiler
//  => 레퍼런스가 null인 경우 발생하는 오류가 많다.
//  => 컴파일러를 통해 체크하는 기술
//  => Java 8(Optional - library)

// var a: Type  = null    // Error!
// var b: Type? = null    // Ok!

fun hoo(name: String) {
    println("Hello, $name")
}

fun main(args: Array<String>) {
    val n1: Optional<Int> = Optional.empty()  // null, Java 8

    val n2: Int? = null                       // Kotlin

    // Nullable 타입에 대해서는 반드시 null 체크가 필요합니다.
    // LambdaExample.foo(null)

    // Java와의 상호 운용
    //  Kotlin        Java
    //   String   ->   @NotNull String
    //   String?  ->   String

    val name: String? = null


    // Nullable 타입에 대해서는 반드시 null 체크가 필요합니다.
    // 1. Smart Cast를 통해서 null 가능성을 없앤다.
    // if (name == null)
    //    return

    // 2. 안전한 널 참조 연산(Safe null access operator)
    //     ?.
    //   ; null이면 전체 연산의 결과가 null이 된다.
    // var length = name?.length

    // 3. 강제 접근
    //   : 예외가 발생한다.
    // var length = name!!.length
}










