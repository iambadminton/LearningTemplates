package HeadFirstJava.chap16;

import java.util.HashSet;

/**
 * Created by a.shipulin on 20.12.17.
 */
public class TestCollections {
    public static void main(String[] args) {
        HashSet<MyInteger> list = new HashSet<>();
        MyInteger seventeen = new MyInteger(17);
        list.add(new MyInteger(10));
        list.add(new MyInteger(50));
        list.add(new MyInteger(2));
        list.add(new MyInteger(0));
        /*list.add(new MyInteger(17));*/ list.add(seventeen);
        list.add(new MyInteger(18));
        list.add(new MyInteger(7));
        /*list.add(new MyInteger(17));*/ list.add(seventeen);
        for (MyInteger i : list
                ) {
            System.out.println(i.toString());
        }
        System.out.println("=======");
        //Collections.sort(list);
        for (MyInteger j : list
                ) {
            System.out.println(j.toString());

        }


    }
}
