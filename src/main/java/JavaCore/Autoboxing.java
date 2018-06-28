package JavaCore;

/**
 * Created by a.shipulin on 05.06.18.
 */
public class Autoboxing {
    public static void main(String[] args) {
        Integer iOb1 = 100; // фактически происходит вызов java.lang.Integer.valueOf(100)
        Integer iOb2 = 100; // как и в первом случае, фактически происходит вызов java.lang.Integer.valueOf(100),
        // но значение уже берется из так называемого pool, поэтому тут будем иметь 2 ссылки на одно и то же
        System.out.println(iOb1 == iOb2); // и соответственно, здесь будет true

        Integer iOb3 = new Integer(120);
        Integer iOb4 = new Integer(120);
        System.out.println(iOb3 == iOb4); // из-за явного присваивания здесь будет false

        Integer iOb5 = 200;
        Integer iOb6 = 200;
        System.out.println(iOb5 == iOb6);

    }
}
