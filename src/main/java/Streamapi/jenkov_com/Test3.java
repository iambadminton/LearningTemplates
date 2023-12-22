package Streamapi.jenkov_com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");

        Stream<String> stream = list.stream();
        boolean allMatch = stream.allMatch((val) ->{return val.startsWith("One");});
        System.out.println(allMatch);

        boolean noneMatch = list.stream().noneMatch((val) -> {return "One".equals(val);});
    }
}
