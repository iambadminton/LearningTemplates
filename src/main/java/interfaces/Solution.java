package interfaces;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();

        printPeopleList(map);
        System.out.println(map.size());
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map1 = new IdentityHashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(new String("Фамилия"), "Имя");
        }


        return map1;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

