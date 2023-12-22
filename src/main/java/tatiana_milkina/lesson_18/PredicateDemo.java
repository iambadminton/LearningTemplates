package tatiana_milkina.lesson_18;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s!= null;
        Predicate<String> predicate1 = s -> s.contains("A");



        System.out.println(predicate.test(null));
        System.out.println(predicate.and(predicate1).test(""));
    }


}
