package Skiena.Chapter4;

import java.util.*;

/**
 * Created by a.shipulin on 14.02.18.
 * Задача: разделить 2n игроков на 2 команды по n игроков самым несправедливым способом, при условии, что у каждого игрока
 * есть рейтинг, т.е. создать самое большое неравенство между командами.
 * <p>
 * Варианты сортировки смотрел тут: https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java
 */

/*class Person {
    String SecondName;
    Integer Rating;
}*/

public class excercise1 {
    HashMap<String, Integer> players;
    HashMap<String, Integer> team1;
    HashMap<String, Integer> team2;

    public excercise1() {
        this.players = new HashMap<String, Integer>();
        players.put(new String("Анатолий"), 5);
        players.put(new String("Сергей"), 10);
        players.put(new String("Михаил"), 1);
        players.put(new String("Евгений"), 2);
        players.put(new String("Федор"), 11);
        players.put(new String("Максим"), 15);
        players.put(new String("Руслан"), 16);
        players.put(new String("Потап"), 17);
        players.put(new String("Дмитрий"), 18);
        players.put(new String("Савелий"), 3);
        players.put(new String("Артем"), 4);
        players.put(new String("Егор"), 7);
    }


    public void sort() {
        int i = 0;
        /*List list = new ArrayList<>(this.players.entrySet());
        for (Map.Entry<String, Integer> entry: this.players.entrySet()) {
            System.out.println(entry.toString());
            
        }*/

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

        // сортировка по значению
        /*List<Map<String, Integer>> list = new LinkedList<String, Integer>(players.entrySet());*/
        /*Collections.sort(list, new Comparator<Map<String, Integer>>() {
            @Override
            public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });*/

        ValueComparator bvc = new ValueComparator(this.players);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        sorted_map.putAll(this.players);
        System.out.println("sorted map: " +  sorted_map);
        Set set3 = sorted_map.entrySet();
        Iterator iterator3 = set3.iterator();
        while(iterator3.hasNext()) {
            i++;
            System.out.println("iterator3.next()=" + iterator3.next());
            /*if(i<=6 ) {
                this.team1.put(set3.)
            }*/
        }

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
                return -    1;
            }

        }
    }


    public static void main(String[] args) {
        excercise1 ex = new excercise1();
        ex.sort();
    }
}
