
fun<T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = "") : String {

    val result = StringBuilder(prefix);

    for ((index, element) in collection.withIndex()) {
        if (index > 0)
            result.append(separator);
        result.append(element);
    }

    result.append(postfix);

    return result.toString();
}

//extension function
fun String.lastChar() : Char = this.get(this.length - 1);

fun<T> Collection<T>.myJoinToString(separator: String = ", ", prefix: String = "", postfix: String = "") : String {
    val result = StringBuilder(prefix);

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator);
        result.append(element);
    }

    result.append(postfix);

    return result.toString();
}

fun main_list_003_001(args: Array<String>)
{
    println(args);

    val list = listOf(1, 3, 5, 7, 9);
    println(joinToString(list, ";", "(", ")"));
    println(joinToString(collection = list, separator = ",", prefix = "", postfix = ""));
    println(joinToString(collection = list, prefix = "[", postfix = "]"));

    println("Extension versino of myJoinToString");
    println(list.myJoinToString(postfix = "}", prefix = "{"));

    val str = "Hello World!";
    println(str.lastChar());
}
