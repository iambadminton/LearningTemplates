package HeadFirstDesignPatterns.Decorator;

/**
 * Created by a.shipulin on 04.04.18.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

