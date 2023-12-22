package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tester {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("One", "1");
        map.put("Five", "5");
        map.put("Four", "4");
        map.put("Two", "2");
        map.put("Three", "3");
        map.put(null, "Null");

        System.out.println("HashMap: \n" + map);


        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("One", "1");
        treeMap.put("Five", "5");
        treeMap.put("Four", "4");
        treeMap.put("Two", "2");
        treeMap.put("Three", "3");

        System.out.println("TreeMap: \n" + treeMap);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", "1");
        linkedHashMap.put("Five", "5");
        linkedHashMap.put("Four", "4");
        linkedHashMap.put("Two", "2");
        linkedHashMap.put("Three", "3");

        System.out.println("LinkedHashMap: \n" + linkedHashMap);

    }
}
