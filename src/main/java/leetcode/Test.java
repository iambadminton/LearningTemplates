package leetcode;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(6);
        set.add(7);
        System.out.println(set.size());


    }
}
