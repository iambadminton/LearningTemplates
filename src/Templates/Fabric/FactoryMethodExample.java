package Templates.Fabric;

/**
 * Created by a.shipulin on 02.11.16.
 */
public class FactoryMethodExample {
    public static void main(String[] args) {
        // an array of creators
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        // iterate over creators and create products
        for (Creator creator: creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
