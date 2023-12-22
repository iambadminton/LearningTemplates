package Collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(10, 2, 30, 4, 5));

        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(list);
        for (Object a : list) {
            System.out.println((Integer) a);
        }

    }
}
