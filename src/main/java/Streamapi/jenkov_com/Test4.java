package Streamapi.jenkov_com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Stream<String> stream = list.stream();
        Optional<String> result = stream.findFirst();
        System.out.println(result.get());
    }
}
