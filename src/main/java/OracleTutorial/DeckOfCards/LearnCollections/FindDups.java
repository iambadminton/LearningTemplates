package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 22.11.16.
 */
import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        /*Comparator<String> comp =*/
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}

