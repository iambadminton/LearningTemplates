package udemy_java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);
        arrayList.remove(5);

        System.out.println(arrayList);

//        Iterator<Integer> iter = arrayList.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(new int[]{1,2,3}));
        arrayList.removeAll(arr2);

        System.out.println(arrayList);





    }
}
