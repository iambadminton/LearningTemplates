package Collections;

public class Book implements Comparable<Book> {
    private String name;
    private String isbn;
    private int pages;
    private double price;
    private String author;

    public Book(String name, String isbn, int pages, double price, String author) {
        this.name = name;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        int l1 = this.name.length();
        int l2 = o.name.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = this.name.charAt(i);
            int str2_ch = o.name.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
