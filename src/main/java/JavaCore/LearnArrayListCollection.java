package JavaCore;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by a.shipulin on 31.08.18.
 */
public class LearnArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add(new String("mp"));
        arr.add(new String("aw"));
        arr.add(new String("strela"));
        arr.add(new String("dri"));
        arr.add(new String("vbtewk"));
        arr.add(new String("/jdfdi"));
        arr.add(new String("gazprom"));
        arr.add(new String("синий"));

        ListIterator iterator = arr.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }



    }
}
