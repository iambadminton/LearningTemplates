package HeadFirstJava;

/**
 * Created by a.shipulin on 16.11.17.
 * демонстрация вызова конструкторов классов-родителей и классов-сыновей
 * при создании объекта-сына
 */
public class TestCallConstructorInh  extends TestCallConstructor {

    public TestCallConstructorInh(String str) {
         System.out.println("TestCallConstructorInh::str=" + str);
    }


    public TestCallConstructorInh() {
        this("Вызов одного конструктора из другого");
        System.out.println("TestCallConstructorInh");
    }

    public static void main(String[] args) {
        TestCallConstructorInh inh = new TestCallConstructorInh();
    }
}
