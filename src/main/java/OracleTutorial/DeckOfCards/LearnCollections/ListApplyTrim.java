package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by a.shipulin on 22.11.16.
 */
public class ListApplyTrim {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        listTrim(list);
        for (String s : list) {
            System.out.format("\"%s\"%n", s);
        }
    }
    public static void listTrim(List<String> strings) {
        for(ListIterator<String> l = strings.listIterator(); l.hasNext();) {
            l.toString().trim();
            l.set(l.next().trim());
        }
    }
}
