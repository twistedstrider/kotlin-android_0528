package java_examples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // User user = new User("Tom", "Suwon", 100, 200);
//        User user = new User("Tom", 42);
//        user.setAge(42);
//        System.out.println(user.getAge());


//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);

        List<Integer> list = Arrays.asList(10, 20, 30);

        for (Integer e : list) {
            System.out.println(e);
        }


    }
}

/*
public class Program {
    public static void foo() {
    }

    public static void main(String[] args) {
        User user = new User();
//        user.age = 42;


        // System.out.println(foo());

//        System.out.println("Hello, Java");
//        User user = new User();  // Kotlin


        // val - final Integer
        // var - Integer
        final Integer n1 = new Integer(42);
        // n1 = new Integer(100);

        final int n2 = 42;
        // n2 = 100;

    }
}
*/










