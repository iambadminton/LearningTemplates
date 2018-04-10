package HeadFirstDesignPatterns.Factory;

/**
 * Created by a.shipulin on 06.04.18.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY STYLE Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marianare Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
