package SharpenSkills;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Created by a.shipulin on 28.02.18.
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }


    public static void main(String[] args) {
        DescendingOrder dor = new DescendingOrder();
        System.out.println(dor.sortDesc(78291));


    }
}
