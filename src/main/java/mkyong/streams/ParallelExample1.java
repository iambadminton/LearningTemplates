package mkyong.streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ParallelExample1 {
    public static void main(String[] args) {
        System.out.println("Normal...");
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("Parallel...");
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);

        IntStream range3 = IntStream.rangeClosed(50, 110);
        OptionalInt minValue = range3.min();
        System.out.println("minValue = " + minValue.getAsInt());


    }
}
