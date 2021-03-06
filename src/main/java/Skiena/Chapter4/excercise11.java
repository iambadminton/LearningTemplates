package Skiena.Chapter4;

import java.util.*;

/**
 * Created by a.shipulin on 14.02.18.
 * Вариант 2 решения задачи:
 * Задача: разделить 2n игроков на 2 команды по n игроков самым несправедливым способом, при условии, что у каждого игрока
 * есть рейтинг, т.е. создать самое большое неравенство между командами.
 * <p>
 * Варианты сортировки смотрел тут: https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java
 */

/*class Person {
    String SecondName;
    Integer Rating;
}*/

public class excercise11 {
    HashMap<String, Integer> players;
    HashMap<String, Integer> team1;
    HashMap<String, Integer> team2;

    public excercise11() {
        this.players = new HashMap<String, Integer>();
        players.put(new String("Анатолий"), 5);
        players.put(new String("Сергей"), 10);
        players.put(new String("Михаил"), 1);
        players.put(new String("Евгений"), 2);
        players.put(new String("Федор"), 6);
        players.put(new String("Максим"), 12);
        players.put(new String("Руслан"), 11);
        players.put(new String("Потап"), 9);
        players.put(new String("Дмитрий"), 8);
        players.put(new String("Савелий"), 3);
        players.put(new String("Артем"), 4);
        players.put(new String("Егор"), 7);
    }


    public void sort() {

        Object obj;


        //SortedMap<String, Integer> sortedPlayers = (SortedMap<String, Integer>) this.players;
        Set set = players.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
        }
        // сортировка по ключу
        Map<String, Integer> map = new TreeMap<String, Integer>(players);
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.println(me2.getKey() + ":" + me2.getValue());
        }


        ValueComparator bvc = new ValueComparator(this.players);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        sorted_map.putAll(this.players);
        System.out.println("sorted map: " + sorted_map);



        /*for(int i = 0; i < sorted_map.size(); i++) {
            if(i <= 6) {

            }
        }*/
        System.out.println("team1=========");
        System.out.println(team1);

    }


    class ValueComparator implements Comparator<String> {
        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        @Override
        public int compare(String o1, String o2) {
            if (base.get(o1) >= base.get(o2)) {
                return 1;
            } else {
                return -1;
            }

        }
    }


    public static void main(String[] args) {
        excercise11 ex = new excercise11();
        ex.sort();
    }
}


