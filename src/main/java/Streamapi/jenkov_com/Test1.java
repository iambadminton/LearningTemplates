package Streamapi.jenkov_com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("One");
        list.add("ONE");
        list.add("two");


        Stream<String> stream = list.stream();

        long count = stream
                .count();

        System.out.println("count = " + count);


        Stream<String> stream2 = list.stream();
        String result = stream2
                .filter((value) -> {
                    return value.toLowerCase().equals("one");
                })
                .collect(Collectors.joining(","));
        System.out.println("==========================");
        System.out.println(result);

        System.out.println("===========================");
        System.out.println(
                list.stream().distinct().collect(Collectors.joining("\n"))
        );
        System.out.println("============================");
        System.out.println(list.stream().limit(3).collect(Collectors.joining("\n")));
    }
}
