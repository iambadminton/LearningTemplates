package tatiana_milkina.lesson_18;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());

        printUpperCase.accept("Dear Friend");
        printLowerCase.andThen(printUpperCase).accept("New String");
    }
}
