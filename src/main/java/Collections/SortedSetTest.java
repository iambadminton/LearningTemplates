package Collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        TreeSet<Book> set = new TreeSet<>();
        
        set.add(new Book("The lost world", "isbn1", 289, 12.50, "Conan Doyle"));
        set.add(new Book("Tom Soyer", "isbn2", 455, 8.50, "Mark Twen"));
        set.add(new Book("Idiot", "isbn3", 541,  16.50, "Theodor Dostoevsky"));
        set.add(new Book("To kill a mockingbird", "isbn4", 319, 15.50, "Harper Lee"));
        set.add(new Book("Горе от ума", "isbn5", 548, 13.50, "Александр Грибоедов"));


        //Iterator<Book> iterator = set.iterator();
        Iterator<Book> iterator = set.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println((Book)iterator.next());
        }
    }
}
