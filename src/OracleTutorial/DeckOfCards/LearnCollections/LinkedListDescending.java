package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by a.shipulin on 06.06.17.
 */
public class LinkedListDescending {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("r");
        list.add("c");
        list.add("d");

        Iterator<String> itr = list.descendingIterator();
        //Iterator<String> itr = list.iterator();
        String str;
        while(itr.hasNext()) {
            str = itr.next();
            System.out.println(str);
        }


        System.out.println("list=" + list);
    }
}
