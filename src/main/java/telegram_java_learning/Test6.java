package telegram_java_learning;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        String[] names = {"Java", "Kotlin", "Java"};
        String name = "Java";

        Predicate predicate = name::equals;
        System.out.println(Stream.of(names).filter(predicate).count());
        name = "Kotlin";
        System.out.println(Stream.of(names).filter(predicate).count());
    }
}
