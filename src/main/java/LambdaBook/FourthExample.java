package LambdaBook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.shipulin on 28.02.18.
 */
public class FourthExample {
    public static void main(String[] args) {
        List<Integer> together = Stream.of(Arrays.asList(1,2), Arrays.asList(3,4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(1,2,3,4), together);

        List<Integer> list = Arrays.asList(1,2,3,4, 100, 200, 458, -1, -15);

        // выведем минимальное значение
        System.out.println("min(1,2,3,4, 100, 200, 458, -1, -15) = " + list.stream().min(Integer::compare).get());

        // просуммируем
        System.out.println("сумма(1,2,3,4, 100, 200, 458, -1, -15) = " + list.stream().reduce(0, (acc, element) -> acc + element));

        // просуммируем по-другому
        //System.out.println(list.stream().sum);


    }
}
