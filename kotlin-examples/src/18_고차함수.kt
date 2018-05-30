
// 고차(고계) 함수
//  : Higher Order Function

//  정의?
//  : 함수를 인자로 전달 받거나 함수를 반환하는 함수

//  고차 함수를 왜 사용하는가?
//   1) 다양한 시나리오에서 동작하는 함수 코드 중복을 없앨 수 있다.
//   2) 함수의 재사용성을 극대화!

//  Kotlin Collection Interface
//      List<E>,        Set<E>,        Map<K, V>        : Immutable
//   MutableList<E>, MutableSet<E>, MutableMap<K, V>    : Mutable

fun filterEvens(data: List<Int>) : List<Int> {
    val result = mutableListOf<Int>()

}

fun filterOdds(data: List<Int>) : List<Int> {
    return emptyList()
}


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evens = filterEvens(list)
    val odds = filterOdds(list)

    println("evens: $evens")
    println("odds: $odds")
}















