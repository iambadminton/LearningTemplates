package HeadFirstDesignPatterns.PatternStrategy;

/**
 * Created by a.shipulin on 29.03.18.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
