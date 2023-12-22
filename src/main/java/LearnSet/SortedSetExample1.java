package LearnSet;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample1 {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if(integer > t1) {
                    return 1;
                }
                else if(integer < t1) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        for(int i = 0; i < 10; i++) {
            set.add(i);

        }
    }
}
