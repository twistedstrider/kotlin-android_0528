package ex26

// 범위 지정 함수
//   1. let
fun sendEmail(to: String): Boolean {
    println("send email to $to")
    return true
}


class User {
    var email: String? = null
}


/*
    // Swift
    if let name = name {

    }
*/

/*
fun main(args: Array<String>) {
    val user = User()
    // user.email = "chansigi@gmail.com"

    // email이 null 이면 비정상 종료 합니다.
    // sendEmail(user.email!!)

    /*
    if (user.email != null)
        sendEmail(user.email)
    */

    // fun<T, R> T.let(block: (T) -> R): R
    val result = user.email?.let { email -> sendEmail(email) } ?: false
    user.email?.let { sendEmail(it) }
}
*/

/*
class User {
    lateinit var email: String
}


fun main(args: Array<String>) {
    val user = User()
    user.email = "chansigi@gmail.com"

    // email이 null 이면 비정상 종료 합니다.
    // sendEmail(user.email!!)

    sendEmail(user.email)
}
*/

//   2. with
//   3. apply

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z')
        result.append(letter)

    result.append("\n")
    return result.toString()
}


fun alphabet_with1() : String {
    val result = StringBuilder()

    // 수신 객체 지정 람다
    // with의 결과는 람다 블록의 결과 입니다.
    return with (result) {
        for (letter in 'A'..'Z')
            append(letter)
        append("\n")
        toString()
    }
}


fun alphabet_with2() = with(StringBuilder()) {
    for (letter in 'A'..'Z')
        append(letter)
    append("\n")
    toString()
}


fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet_with1())
    println(alphabet_with2())
}

























