package telegram_java_learning;

import java.util.Optional;

public class Test7 {
    interface I {
        String generate();

        default void print (String value) {
            System.out.println(Optional.ofNullable(value).orElseGet(this::generate));
        }
    }

    public static void main(String[] args) {
        ((I) ()-> "Hello").print(null);
    }
}
