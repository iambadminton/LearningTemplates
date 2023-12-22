package patterns.creational.factory_method.alexey_pashchenko;



/**
 * Фабричный метод решает проблему создания объектов разного типа одним методом.
 * Создаваемые объекты зависят от логики одного метода
 */
public class Main {
    public static void main(String[] args) {
        Gift giftA = new GiftFactory().createGift(2);
        System.out.println(giftA.getName());
    }
}
