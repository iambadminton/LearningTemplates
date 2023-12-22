package tatiana_milkina.lesson_18;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (str1, str2) -> {
            System.out.println(str1 + " " + str2);
        };

        biConsumer.accept("Hello", "World");
    }
}
