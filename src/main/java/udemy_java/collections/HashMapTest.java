package udemy_java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
