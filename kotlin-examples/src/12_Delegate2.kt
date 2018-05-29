package ex12_2

import kotlin.reflect.KProperty

// Delegation for Property
//  : 프로퍼티를 위한 위임의 기능
//   -> Property에 대해서 getter / setter 동작을 다른 클래스의 객체에게 위임하는 것이 가능합니다.

// getter, setter의 동작은 연산자 재정의 함수를 통해 변경할 수 있습니다.

class SampleDelegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String {
        return "$thisRef - ${property.name}"
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("$thisRef - ${property.name} to $value")
    }
}


class User {
    var name: String by SampleDelegate()
    var address: String by SampleDelegate()

    override fun toString(): String {
        return "User"
    }
}

fun main(args: Array<String>) {
    val user = User()

    user.name = "Tom"    // setter
    println(user.name)   // getter

    user.address = "Suwon" // setter
    println(user.address)  // getter
}