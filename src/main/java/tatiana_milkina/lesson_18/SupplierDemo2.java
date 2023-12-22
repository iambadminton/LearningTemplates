package tatiana_milkina.lesson_18;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int)(
            Math.random() *10
        );

        System.out.println(supplier.get());
    }

    Random random = new Random(10);


}
