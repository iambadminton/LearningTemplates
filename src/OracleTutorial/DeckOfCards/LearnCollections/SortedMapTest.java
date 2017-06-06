package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by a.shipulin on 06.06.17.
 */
public class SortedMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();
        map.put("b", "bb");
        map.put("ba", "baba");
        map.put("c", "cc");
        map.put("a", "aa");
        map.put("d", "dd");
        System.out.println(map);


    }
}
