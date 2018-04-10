package HeadFirstDesignPatterns.Decorator;

/**
 * Created by a.shipulin on 04.04.18.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }


}
