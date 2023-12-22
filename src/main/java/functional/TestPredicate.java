package functional;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate = (str1) ->
            str1.equals("");

        System.out.println("test aaa: " + predicate.test("aaa"));
        System.out.println("test: '': " + predicate.test(""));

    }
}
