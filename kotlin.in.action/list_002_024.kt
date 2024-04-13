import java.util.TreeMap

fun main_list_002_024(args: Array<String>)
{
    println(args);

    val binaryReps = TreeMap<Char, String>();
    
    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.code);    //Char.toInt() is deprecated!
        binaryReps[c] = binary;
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary");
    }

    val list = arrayListOf("10", "11", "1001");
    for ((index, element) in list.withIndex()) {
        println("[$index] -> $element");
    }
}
