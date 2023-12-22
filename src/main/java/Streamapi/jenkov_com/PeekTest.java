package Streamapi.jenkov_com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekTest {
    public static void main(String[] args) {
        List<String> strinList = new ArrayList<>();
        strinList.add("abc");
        strinList.add("def");

        Stream<String> stream = strinList.stream();
        Stream<String> streamPeeked = stream.peek((value) -> {
            System.out.println("value");
        });
    }
}
