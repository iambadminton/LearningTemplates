package HeadFirstDesignPatterns.Adapter;

/**
 * Created by a.shipulin on 27.04.18.
 */
public class MallardDuck  implements  Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");

    }
}
