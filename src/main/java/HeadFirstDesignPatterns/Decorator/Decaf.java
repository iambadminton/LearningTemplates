package HeadFirstDesignPatterns.Decorator;

/**
 * Created by a.shipulin on 04.04.18.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
