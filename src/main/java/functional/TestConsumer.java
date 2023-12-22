package functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestConsumer {
    public static void main(String args[]) {
        Consumer<String> out = (say) -> System.out.println(say);
        Consumer<String> length = (str) -> System.out.println("длина: " + str.length());
        Consumer<String> trim = (str) -> System.out.println("результат trim: " + str.trim());
        Predicate<String> is8Symbols = (str) -> str.length() == 8;
        Function<String, Integer> getLength = (str) -> {
            return str.length();
        };

        String str1 = " Строка 1";
        String str2 = "Строка номер 2";

        out.accept(str1);
        System.out.println("=========================");
        out.andThen(length).andThen(trim).accept(str1);



    }
}
