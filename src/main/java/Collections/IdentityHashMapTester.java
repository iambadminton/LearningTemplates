package Collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTester {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new IdentityHashMap<>(  );
//        map.put(new Integer(1), 10);
//        map.put(new Integer(3), 2);
//        map.put(new Integer(4), 3);
//        map.put(new Integer(5), 34);
//        map.put(new Integer(4), 23);
//        map.put(new Integer(5), 34);
//        map.put(new Integer(10), 11);
//        map.put(new Integer(12), 12);

        map.put(1, 10);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 34);
        map.put(4, 23);
        map.put(5, 34);
        map.put(10, 11);
        map.put(11, 12);

        System.out.println(map.size());
        System.out.println(map.toString());
    }
}
