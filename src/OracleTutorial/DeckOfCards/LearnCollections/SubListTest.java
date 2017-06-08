package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 07.06.17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubListTest {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> theNumbers = new LinkedList<Integer>(Arrays.asList(4, 8, 15, 16, 23, 42));
        System.out.println("theNumbers=" + theNumbers);
        System.out.println("list=" + list);
        /*list = theNumbers.subList(2, 5);
        System.out.println("theNumbers=" + theNumbers);
        System.out.println("list=" + list);*/

        theNumbers.subList(2,5).clear();
        System.out.println("theNumbers=" + theNumbers);
        System.out.println("list=" + list);

        theNumbers.set(2, new Integer(100));
        System.out.println("theNumbers=" + theNumbers);
        System.out.println("list=" + list);

        for(Integer num: theNumbers.subList(1,2) ) {
            System.out.println("num=" + num);
        }

    }
}

