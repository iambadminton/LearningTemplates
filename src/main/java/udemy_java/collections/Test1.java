package udemy_java.collections;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> listFirst = new ArrayList<>();
        listFirst.add("White");
        listFirst.add("Black");
        listFirst.add("Red");

        List<String> listSecond = new ArrayList<>();

        listSecond.add("Green");
        listSecond.add("Red");
        listSecond.add("White");
        listSecond.add("Yellow");
        listSecond.add("Rose");
        listSecond.add("Blue");
        listSecond.add("Brown");
        listSecond.add("Black");
        listSecond.add("Purpure");

        //listFirst.retainAll(listSecond);
        //System.out.println(listFirst);

        ListIterator<String> iterator = listSecond.listIterator(4);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------\n");
        iterator = listSecond.listIterator(listSecond.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.addAll(listSecond);

        System.out.println("---------------\n");

        Iterator<String> listIterator = linkedlist.descendingIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
