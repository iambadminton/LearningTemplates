package LearnCollection.Habrahabr;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by a.shipulin on 03.09.18.
 */
public class HowToWorkArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size());
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list.size());
        list.add(5, "100");
        System.out.println("========= after insert:");
        for (String elem: list) {
            System.out.print(elem + " ");
        }
        Collections.shuffle(list);
        System.out.println("\n========= after shuffle:");
        for (String elem: list) {
            System.out.print(elem + " ");
        }

    }
}
