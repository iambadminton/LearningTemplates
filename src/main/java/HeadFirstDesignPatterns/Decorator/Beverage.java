package HeadFirstDesignPatterns.Decorator;

/**
 * Created by a.shipulin on 04.04.18.
 */

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

