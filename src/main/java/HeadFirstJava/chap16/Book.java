package HeadFirstJava.chap16;

/**
 * Created by a.shipulin on 20.12.17.
 */
public class Book implements Comparable {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Object o) {
        Book book = (Book)o;

        return (title.compareTo(book.title));
    }
}
