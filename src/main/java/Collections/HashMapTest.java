package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "aa");
        hashMap.put("b", "bb");
        hashMap.put("c", "cc");
        hashMap.put("d", "dd");
        hashMap.put("e", "ee");

        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }
        System.out.println("==============");
        List<String> list = new ArrayList<>(hashMap.values());

        for (String s : list) {
            System.out.println(s);

        }


    }
}
