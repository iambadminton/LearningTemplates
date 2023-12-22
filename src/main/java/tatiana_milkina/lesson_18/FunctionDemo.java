package tatiana_milkina.lesson_18;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.7d));
    }
}
