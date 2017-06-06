package AlgorithmsAndStructures;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by a.shipulin on 02.06.17.
 */
public class FindDups {
    public static void main(String[] args) {
        //Set<String> s = new HashSet<String>();
        Set<String> s = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String str;
        String[] words;
        System.out.println("Введите текст для поиска в нем дубликатов:");
        /*while (sc.hasNextLine()) {
            s.add(sc.nextLine());
        }*/
        str = sc.nextLine();
        words = str.split(" ");

        for (String a : words) {
            s.add(a);
        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}
