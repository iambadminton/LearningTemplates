package HeadFirstJava.chap16;

import java.util.TreeSet;

/**
 * Created by a.shipulin on 20.12.17.
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново свое тело");
        Book b3 = new Book("В поисках эмо");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}
