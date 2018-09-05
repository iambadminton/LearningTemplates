package LearnCollection.Habrahabr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by a.shipulin on 03.09.18.
 */
public class HowToWorkHashSet {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");
        map.put("6", "F");
        map.put("7", "G");
        map.put("8", "H");
        map.put("9", "I");
        map.put("10", "J");
        map.put("11", "K");
        map.put("12", "L");
        map.put("13", null);
        map.put(null, "M");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }
        System.out.println("=========================");
        HashSet<String> set = new HashSet<String>(map.keySet());
        for (String elem : set) {
            System.out.println(elem);

        }



    }
}
