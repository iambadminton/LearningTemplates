package HeadFirstJava.chap16;

import java.util.TreeSet;

/**
 * Created by a.shipulin on 20.12.17.
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Song> songs = new TreeSet<>();
        songs.add(new Song("Три счастливых дня", "А. Пугачева", "10", "128"));
        songs.add(new Song("С первого взгляда", "А. Лорак", "9", "128"));
        songs.add(new Song("Что такое осень", "Шевчук", "8", "128"));

        for (Song j: songs
             ) {
            System.out.println(j.toString());

        }




    }
}
