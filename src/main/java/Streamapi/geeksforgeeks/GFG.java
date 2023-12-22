package Streamapi.geeksforgeeks;

import java.util.stream.Stream;

public class GFG {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Geeks", "For",
                "Geeks", "A", "Computer", "Portal");
        stream.forEach(System.out::println);
    }


}
