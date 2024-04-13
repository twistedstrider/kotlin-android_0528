fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 5 == 0 -> "Buzz "
    i % 3 == 0 -> "Fizz "
    else -> "$i "
}

fun main_list_002_022(args: Array<String>)
{
    println(args)

    for (i in 1..100) {
        print(fizzBuzz(i));
    }

    println();

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i));
    }

    println();

    for (i in 1 until 100) {
        print(fizzBuzz(i));
    }
}
