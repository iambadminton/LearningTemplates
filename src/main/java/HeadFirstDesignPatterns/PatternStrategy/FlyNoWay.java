package HeadFirstDesignPatterns.PatternStrategy;

/**
 * Created by a.shipulin on 29.03.18.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
