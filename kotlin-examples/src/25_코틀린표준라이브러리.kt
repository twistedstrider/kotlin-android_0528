package ex25

import java.io.File

// 1. 조건 확인 함수
//   check(condition): condition 거짓이면 예외가 발생한다.
//                     -> IllegalStateException

//   require(condition): IllegalArgumentException
//     -> 함수를 설계할 때 인자를 체크하는 용도
fun log(filename: String, message: String) {

    // filename에 해당하는 파일이 이미 존재하는지 여부를 확인하고 싶다.
    // 존재하면 안된다.
    val file = File(filename)
    // if (file.exists()) {
    //    throw IllegalStateException("이미 존재하는 파일입니다.")
    // }
    check(!file.exists())

    // message의 길이가 1 이상인지 체크한다.
    require(message.isNotEmpty())
}

fun log(message: String?) {
    require(message != null) // Exception

    // val value = requireNotNull(message)
    // message: null이 아니면 nullable을 없앤 타입을 반환한다.

    require(message != null)
    // 스마트캐스트가 적용되지 않습니다.
    // message.length
}

// 2. 명시적인 종료 함수
//    error() / TODO()

fun main(args: Array<String>) {
    // log("hello.log", "Hello, Kotlin")
    // log("hello.log", "")
    // log("state.dat", "Hello, Kotlin")

    // TODO("Not Implemented")  -> NotImplementedError
    // error("Not Implemented") -> IllegalStateException
}










