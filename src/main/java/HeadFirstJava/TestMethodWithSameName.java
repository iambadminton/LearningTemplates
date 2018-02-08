package HeadFirstJava;

/**
 * Created by a.shipulin on 15.11.17.
 * тестируем создание метода, который не является конструктором, но имя совпадает с именем класса
 */
public class TestMethodWithSameName {

    int a;
    public int TestMethodWithSameName() {
        System.out.println("TestMethodWithSameName");
        return 0;
    }

    public TestMethodWithSameName() {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        TestMethodWithSameName  sameName = new TestMethodWithSameName();

    }


}
