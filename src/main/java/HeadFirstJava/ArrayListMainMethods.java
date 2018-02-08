package HeadFirstJava;

import java.util.ArrayList;

/**
 * Created by a.shipulin on 13.11.17.
 */
public class ArrayListMainMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(45);
        list.add(77);
        list.add(82);
        list.add(87);
        list.add(12);
        list.add(1);

        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("========== удалили 1-ый элемент");
        list.remove(1);
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("========= удалили все единицы");
        list.remove(new Integer(1));
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("========= удалили все единицы");
        list.remove(new Integer(1));
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("indexOf(12)=" + list.indexOf(12));
        System.out.println("size=" + list.size());

        System.out.println("contains(87)=" + list.contains(87));
        System.out.println("contains(87)=" + list.contains(886));

        System.out.println("===========");
        list.add(1, 777);
        for (Integer i : list
                ) {
            System.out.println(i);

        }



    }



}
