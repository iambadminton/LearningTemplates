package leetcode;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tst {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(1, 1);
        map.put(3,3);
        map.put(5,5);
        map.put(2,2);
        map.put(4,4);

        Set<Integer> set = map.keySet();
        for (Integer key : set ) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
