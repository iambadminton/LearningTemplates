package JavaCore;

/**
 * Created by a.shipulin on 24.08.18.
 */
public interface DefaultMethodExample {
    default public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }


}
