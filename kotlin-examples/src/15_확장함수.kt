// 확장 함수(Extension Function)
//  : 기존 자바 API를 수정하지 않고도 코틀린이 제공하는 편리한 기능을 사용할 수 있도록
//    해준다.

// 확장(Extension)
//   1. 수직 확장   ->  상속
//   2. 수평 확장   ->  확장 함수

// 수직 확장(상속)의 문제점
//   1. 깨지기 쉬운 기반 클래스 문제
//   2. 상속 금지되어 있는 클래스는 확장이 불가능하다.

// 수평 확장
//   1. C#: Extension Method
//   2. Swift: Extension
//   3. ObjC: Category
//   4. Javascript: Prototype
//     => Kotlin: Extension Function

// DSL(Domain Specific Language)
//   : 각각에 도메인에 특화된 언어를 쉽게 설계 가능하다.
//   Anko(Jetbrains) - Android DSL
package ex15

// fun lastChar(text: String) = text.get(text.length - 1)
// fun lastChar(text: String) = text[text.length - 1]

// String: 수신 객체 타입
// this:   수신 객체 참조
fun String.lastChar(/* text: String */) = this[length - 1]

fun main(args: Array<String>) {
    val s = "Tom"

    // lastChar(s) // (String) -> Char
    val result = s.lastChar()
    println(result)
}


















