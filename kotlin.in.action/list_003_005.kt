
open class View {
    open fun click() = println("View clicked");
}

class Button : View() {
    override fun click() = println("Button clicked");
}

fun View.showOff() = println("I'm View!");
fun Button.showOff() = println("I'm Button!");

fun main_list_003_005(args: Array<String>)
{
    println(args);

    val view: View = Button();
    view.click();
    view.showOff();

    val btn = Button();
    btn.click();
    btn.showOff();
}

