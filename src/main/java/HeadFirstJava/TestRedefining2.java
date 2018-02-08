package HeadFirstJava;

/**
 * Created by a.shipulin on 14.11.17.
 */
public class TestRedefining2 extends TestRedefining {
    @Override
    public long sum() {
        return super.sum();
    }

    @Override
    public void printNum(int d) {
        super.printNum(d);
    }

    public static void main(String[] args) {
        TestRedefining2 redefining2 = new TestRedefining2();
        redefining2.a = 1;
        redefining2.b = 3;
        System.out.println(redefining2.sum());
        System.out.println(redefining2.getClass());
    }
}
