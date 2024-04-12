package geometry.shapes;
import java.util.Random;

enum class Color0 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

data class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = (width == height);
}

fun createRandomRectangle() : Rectangle {
    val random = Random();
    return Rectangle(random.nextInt() % 100, random.nextInt() % 100);
}

fun printRect(rect: Rectangle) {
    println("$rect is${if (rect.isSquare) "" else " not"} square!");
}

fun main_list_002_008(args : Array<String>) {
    println("$args");

    val rect1 = createRandomRectangle();
    val rect2 = createRandomRectangle();
    
    // println("rect1(${rect1.width}, ${rect1.height}) is${if (rect1.isSquare) "" else " not"} square!");
    // println("rect2(${rect2.width}, ${rect2.height}) is${if (rect2.isSquare) "" else " not"} square!");
    
    printRect(rect1);
    printRect(rect2);

    val color = Color.VIOLET;
    println(Color.INDIGO.rgb());
    println(getMnemonic(color));
    println(getWarmth(color));

    println(mix(Color.YELLOW, Color.BLUE));
}
