package HeadFirstDesignPatterns.PatternStrategy;

/**
 * Created by a.shipulin on 29.03.18.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
