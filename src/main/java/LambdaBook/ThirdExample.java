package LambdaBook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static org.junit.Assert.assertEquals;

/**
 * Created by a.shipulin on 27.02.18.
 */
public class ThirdExample {
    public static void main(String[] args) {
        /*List<String> collected = new ArrayList<>();
        for (String string : Arrays.asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }*/

        List<String> collected = Stream.of("a", "b", "hello").map(string -> string.toUpperCase()).collect(Collectors.toList());

  //      assertEquals(Arrays.asList("A", "B", "HELLO"), collected);
    }


}
