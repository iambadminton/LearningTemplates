package HeadFirstJava;

/**
 * Created by a.shipulin on 15.11.17.
 */
public class TestConstructor {
    public TestConstructor(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        TestConstructor constructor = new TestConstructor("конструктор");
    }
}
