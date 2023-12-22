package Streamapi;

import java.util.*;

public class JustStreamApi {
    public static void main(String[] args) {
        Integer integerArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(integerArray));

        //numbers.stream().parallel().filter(o -> o % 2 == 0).forEach(s -> System.out.println(s));
        //int summa = numbers.stream().mapToInt(s).sum();


    }
}
