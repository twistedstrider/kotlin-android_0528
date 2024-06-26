import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) : Int? {
    try {
        val line = reader.readLine();
        return Integer.parseInt(line);
    }
    catch (e: NumberFormatException) {
        return null;
    }
    finally {
        reader.close();
    }
}

fun main_list_002_027(args: Array<String>)
{
    println(args);

    val reader1 = BufferedReader(StringReader("239"));
    println(readNumber(reader1));

    val reader2 = BufferedReader(StringReader("239"));
    println(readNumber(reader2));
}
