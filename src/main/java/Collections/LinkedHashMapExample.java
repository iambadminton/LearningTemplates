package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map map = new LinkedHashMap<Integer, String>();
        map.put(1, "One");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(3, "Three");
        map.put(6, "Six");
        map.put(10, "Ten");

        map.values().forEach( value -> System.out.println(value));
        System.out.println("========================");
        map.keySet().forEach(value -> System.out.println(value));
        System.out.println("=========================");
        map.entrySet().forEach(value -> System.out.println(value));
    }
}
