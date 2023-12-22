package LearnSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)) {
                    return 0;
                }
                else if (o1 > o2) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
        set.add(1);
        set.add(2);
        set.add(1);

        for (Integer i: set) {
            System.out.println(i);
        }
    }
}
