package Fabric;

/**
 * Created by a.shipulin on 02.11.16.
 * &&&&&&&&&&&&&&&&&&&&&&&&&&
 */



public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
