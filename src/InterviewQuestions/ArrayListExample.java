package InterviewQuestions;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {
    /**
     * Advantages of arrayList over arrays in java
     *
     * @author www.instanceofjava.com
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        ArrayList list3 = new ArrayList();

        System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(null);
        list.add(null);
        list.add(null);

        System.out.println(list.size());
        //list.remove(0);

        System.out.println(list.size());

        System.out.println("==================");


        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list);
        System.out.println("*******************");

        list3.add(1);
        list3.add(2);

        boolean res = list3.containsAll(list);
        System.out.println("res=" + res);

        list.retainAll(list3);
        System.out.println(list);

    }
}