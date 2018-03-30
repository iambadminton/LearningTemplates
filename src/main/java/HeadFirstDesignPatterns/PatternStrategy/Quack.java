package HeadFirstDesignPatterns.PatternStrategy;

/**
 * Created by a.shipulin on 29.03.18.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
