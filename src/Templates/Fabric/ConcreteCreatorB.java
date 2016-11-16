package Templates.Fabric;

/**
 * Created by a.shipulin on 02.11.16.
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
