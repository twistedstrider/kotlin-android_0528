package ex11_2

// object 용도 2
//    : Kotlin의 클래스는 static 키워드가 존재하지 않습니다.
//    => companion object(동반 객체)

/*
object Log {
    fun i(tag: String, message: String) {
        println("$tag> $message")
    }
}

// 상수(Constant)
//   1. 컴파일 타임 상수: 메모리 공간을 차지하지 않는다.
//     => const val TAG1 = "MainActivity"
//    C#: const
//    C++: constexpr

//   2. 런타임 상수: 메모리 공간을 차지한다.
//                컴파일러가 체크만 한다.
//     => val TAG2: String = MainActivity::class.java.simpleName
//    C#: readonly

class MainActivity {
    // static final String TAG = "MainActivity"
    // static final String TAG = MainActivity.class.getSimpleName()
    companion object {
        const val TAG1 = "MainActivity"
        // const: Compile time 상수 지정 - 메모리 공간 X

        val TAG2: String = MainActivity::class.java.simpleName

        const val VALUE = 42

        fun name(): String {
            return "MainActivity"
        }
    }

    fun onCreate(/* */) {
        Log.i(TAG1, "onCreate")
    }
}

//  => Collections: 컬렉션을 다루는 공통 메소드 집합
//  => Arrays: 배열을 다루는 공통 메소드 집합
//  => Objects: 객체에 대해서 동작하는 공통 메소드 집합
//    : 유틸리티 메소드 클래스
//    -> Kotlin에서는 해당하는 유틸리티 함수를 별도의 파일에 전역 함수로 만들어서 관리하는 것이 좋습니다.
//    -> 패키지 공통 함수


fun main(args: Array<String>) {
    val activity = MainActivity()
    activity.onCreate()

    println(MainActivity.name())
}
*/

// 정적 팩토리 메소드(static factory method)
//  : 객체를 생성하는 편의 함수










