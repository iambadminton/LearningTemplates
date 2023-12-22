package leetcode.learn.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        map.put(1, 3);
        System.out.println(map.values());

    }
}
