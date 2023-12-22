package Collections.navigablemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest1 {
    public static void main(String[] args) {
        NavigableMap map = new TreeMap<String, Integer>();
        map.put("1", 1);
        map.put("3", 3);
        map.put("8", 8);
        map.put("12", 12);
        map.put("7", 7);
        map.put("15", 15);
        map.put("10", 10);
        for (Object key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println("+++++++++++");
        System.out.println(map.floorKey("12"));
        System.out.println(map.lastEntry());
        Map newMap = map.descendingMap();
        System.out.println("****************");
        for (Object key : newMap.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
