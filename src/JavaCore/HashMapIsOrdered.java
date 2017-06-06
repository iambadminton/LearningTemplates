package JavaCore;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by a.shipulin on 05.06.17.
 */
public class HashMapIsOrdered {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<Integer>();
        Hashtable<Integer, Integer> hashMap = new Hashtable<Integer, Integer>();

        hashMap.put(0, 0);
        hashMap.put(2, 2);
        hashMap.put(1, 1);
        hashMap.put(3, 3);
        /*hashMap.put(4, null);*/
        /*hashMap.put(null, 10);*/


        // printing result of adding
        // 1 example
        for(Map.Entry entry: hashMap.entrySet()) {
            System.out.println("key=" + entry.getKey());
            System.out.println("value=" + entry.getValue());
        }
        //
        // 2-nd example
        /*
        Iterator<Map.Entry<Integer,Integer>> itr = hashMap.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + " value=" + value);

        }*/

    }


}
