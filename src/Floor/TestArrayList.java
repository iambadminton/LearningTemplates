package Floor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a.shipulin on 30.05.17.
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i, i);
        }

        for (Iterator<Integer> it = arr.iterator();it.hasNext();) {
            Integer ii = it.next();
            System.out.println(ii);
            if(ii  == 2 *Math.ceil(ii/2)) {
                System.out.println("ii=" + ii);
                it.remove();
            }
        }

        System.out.println("===================");
        for(Integer a:arr) {
            System.out.println(a);
        }

    }

}
