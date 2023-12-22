package udemy_java.collections;

import java.util.Map;
import java.util.TreeMap;

public class Test4 {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put(null,  "null"); // ошибки нет
        System.out.println(map.size()); // вывод: 1
        map.put(0,  "0"); // БАБАХ!! Exception in thread "main" java.lang.NullPointerException
    }
}
