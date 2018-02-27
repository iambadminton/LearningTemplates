package LambdaBook;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by a.shipulin on 27.02.18.
 */
public class SecondExample {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        for (String elem : collected
             ) {
            System.out.println(elem.toString());

        }


    }
}
