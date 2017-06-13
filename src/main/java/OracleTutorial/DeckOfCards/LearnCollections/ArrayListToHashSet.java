package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by a.shipulin on 06.06.17.
 */
public class ArrayListToHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        System.out.println("set=" + set);
        ArrayList<String> list = new ArrayList<String>(set);
        System.out.println("list=" + list);
        Set<String> set2 = new HashSet<String>(list);
        //set2.addAll(list);
        System.out.println("set2=" + set2);

    }
}
