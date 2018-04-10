package HeadFirstDesignPatterns.Decorator;

/**
 * Created by a.shipulin on 04.04.18.
 */

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
