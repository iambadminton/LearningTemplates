package JavaCore;

import java.util.ArrayList;

/**
 * Created by a.shipulin on 05.06.17.
 */
public class ArrayListMaxSize {
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<Long>();
        long l = 0;
        while(true) {
            l++;
            arr.add(l);
            System.out.println(l);
        }

    }
}
