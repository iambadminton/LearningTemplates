package JavaCore;

/**
 * Created by a.shipulin on 24.08.18.
 */
public class DefaultMethodImplement implements DefaultMethodExample {
    public static void main(String[] args) {
        DefaultMethodImplement obj = new DefaultMethodImplement();
        obj.sayHello("Вася");

        System.out.println(DefaultMethodImplement.class.getClassLoader());
    }
}
