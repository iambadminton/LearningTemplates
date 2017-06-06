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

        Iterator itr = new
        list.descendingIterator();
        System.out.println("list=" + list);
    }
}
