package Streamapi;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //первый способ
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a4", "a5", "a6");
        Stream<String> streamFromCollection = collection.stream();

        //streamFromCollection.forEach((el) -> System.out.println(el));

//        Arrays.asList("a1","a2","a3","a4","a5","a6").stream().filter((el) -> el.contains("2"))
//                .collect(Collectors.toList())
//                .forEach(e-> System.out.println(e));

//        Arrays.asList("a1","a2","a3","a4","a5","a6")
//                .stream()
//                .filter(e -> Integer.valueOf(e.charAt(1)) %2 == 0)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        Map<String, String> fruits = Stream.of("apple", "banana", "lemon", "orange")
//                .collect(Collectors.toMap(e -> e.substring(0,1), e->e));
//
//        fruits.forEach((k,v) -> System.out.println(k + " => " + v));

        Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
        nameStream
                .filter(e -> e.equals("Bob"))
                .peek(System.out::println)
                .collect(Collectors.toList());

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println(Stream.of("one", "two", "three", "four").count());

        Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(5, 3, 2, 10, 8);
        Optional<Integer> min = streamSupplier.get().min(Comparator.naturalOrder()); // Optional[2]
        Optional<Integer> max = streamSupplier.get().max(Comparator.naturalOrder()); // Optional[10]

        min.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(min.get());
            }
        });
    }
}
