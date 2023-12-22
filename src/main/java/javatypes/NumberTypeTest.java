package javatypes;

public class NumberTypeTest {
    Integer i;

    public NumberTypeTest(Integer i) {
        this.i = i;
    }

    public void showDoubleValue() {
        System.out.println(i.doubleValue());
    }

    public static void main(String[] args) {
        NumberTypeTest test = new NumberTypeTest(10);
        test.showDoubleValue();
    }
}
