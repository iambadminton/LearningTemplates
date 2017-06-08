package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by a.shipulin on 07.06.17.
 */
public class StaticAndNonstatic {
    static List<Character> abc;

    static {
        abc = new LinkedList<Character>();
        for (char c = 'A'; c <= 'Z'; ++c) {
            abc.add(c);
        }
    }

}
