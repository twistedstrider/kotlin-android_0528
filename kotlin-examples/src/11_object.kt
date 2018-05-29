package ex11

import java.io.File

// object의 용도 3가지

// 1) object 선언 - Singleton
object Cursor {
    // 1. 인자를 전달할 수 없습니다.
    // 2. 초기화에 대한 코드는 초기화 블록을 이용하면 됩니다.
    init {
        println("Cursor object created")
    }

    fun move(x: Int, y: Int) {
        println("Move to ($x, $y)")
    }
}

// 상속 / 인터페이스를 구현하는 것도 가능합니다.
object FileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path)
    }
}

fun main(args: Array<String>) {
    println("Program start")

    Cursor.move(10, 32)

    val files = listOf(File("/Z"),
            File("/X"),
            File("/A"))

    // val comparator = FileComparator()
    // val result = files.sortedWith(comparator)

    val result = files.sortedWith(FileComparator)
    println(result)
}















