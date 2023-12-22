package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {
    public static void main(String[] args) {
        Map<String, Book> map = new TreeMap<>();
        map.put("shelf1",
                new Book("War and World", "qqq-qqq", 1500, 700d, "Leo Tolstoy"));
        map.put("table1",new Book("Crime and punishment", "www-www", 500, 550d,
                "Theodor Dostoevsky"));
        map.put("shelf2",
                new Book("Cherry Garden", "eee-eee", 600, 900d, "Anton Chekhov"));
        map.put("tabel2", new Book("Anna Karenina", "rrr-rrr", 400, 650d, "Leo Tolstoy"));
        map.put("shelf3",
                new Book("Taras Bulba", "qqq-www", 120, 250d, "Nikolay Gogol"));
        map.put("table3",
                new Book("Died souls", "qqq-eee", 400, 540d, "Nikolay Gogol"));


        for(Map.Entry<String, Book> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


    }
}
