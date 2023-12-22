package udemy_java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        for(Integer integer : list) {
            list.remove(1);
            System.out.println(integer);
        }

    }
}
