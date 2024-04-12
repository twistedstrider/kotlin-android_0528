data class Person(val name: String, val age: Int? = null)

data class Car(val maker : String, val modelName : String, var isOwned : Boolean);

data class Rectangle(val left: Int, val top: Int, val right: Int, val bottom: Int) {
    val width: Int
        get() {
            return right - left;
        }
    
    val height: Int
        get() {
            return bottom - top;
        }
    val isSquare: Boolean
        get() {
            return width == height;
        }
}

fun main_list_001_001(args: Array<String>) {
    println("$args");

    val persons = listOf(Person("영희"),
                        Person("철수", age = 29),
                        Person("순이", age = 17));
    val oldest = persons.maxBy{it.age ?:0};

    println("나이가 가장 많은 사람: $oldest");

    val name = if (persons.size > 0) persons.get(0).toString() else "Kotlin";
    println("Hello ${name}!");

    val GN7 = Car("Hyundai", "Grandeur", false);
    println("$GN7");

    // println(GN7.maker);
    // println(GN7.modelName);
    // println(GN7.isOwned);

    GN7.isOwned = true;
    // GN7.maker = "KIA";

    val rect1 = Rectangle(0, 0, 10, 20);
    val rect2 = Rectangle(0, 0, 10, 10);
    println("$rect1");
    println("$rect2");
    println("rect1 is${if (rect1.isSquare) "" else " not"} square!");
    println("rect2 is${if (rect2.isSquare) "" else " not"} square!");
}
