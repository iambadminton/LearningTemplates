package OracleTutorial.DeckOfCards.LearnCollections;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by a.shipulin on 21.11.16.
 */
public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*LinkedListProgLibIO<Integer> list = new LinkedListProgLibIO<>();*/
        LocalDateTime begin = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.now();


        for (int i = 0; i < 1000000 ; i++) {
            /*if (i < 10) {
                list.add(i, i);
            } else {
                list.add(3, i);
            }*/
            list.add(i,i);
        }

        end = LocalDateTime.now();
        //System.out.println(list);
        System.out.println(begin);
        System.out.println(end);
        for (int i = 100; i < 1000000 ; i++) {
            list.remove(i);

        }
        list.trimToSize();
        System.out.println(list);
    }
}
