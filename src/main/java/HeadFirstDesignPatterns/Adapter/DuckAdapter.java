package HeadFirstDesignPatterns.Adapter;

import java.util.Random;

/**
 * Created by a.shipulin on 27.04.18.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void fly() {
        if(rand.nextInt(5) == 0) {
            duck.fly();
        }
    }

    @Override
    public void gobble() {
        duck.quack();
    }
}
