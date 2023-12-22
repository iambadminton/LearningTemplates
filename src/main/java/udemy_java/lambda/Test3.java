package udemy_java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        Collection<Integer>  collection = Arrays.asList(1,1,3,4,10, 3,6,7);
        System.out.println(collection);
        System.out.println((collection.stream().filter(e -> e>= 7).collect(Collectors.toList())));
    }
}
