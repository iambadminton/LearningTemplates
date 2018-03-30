package HeadFirstDesignPatterns.PatternStrategy;

/**
 * Created by a.shipulin on 29.03.18.
 */
public class ModelDuck  extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
