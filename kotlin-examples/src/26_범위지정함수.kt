package ex26

// 범위 지정 함수
//   1. let
fun sendEmail(to: String) {
    println("send email to $to")
}

class User {
    var email: String? = null
}

/*
    // Swift
    if let name = name {

    }
*/

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
    user.email?.let { email -> sendEmail(email) }

    user.email?.let { sendEmail(it) }
}


//   2. with
//   3. apply