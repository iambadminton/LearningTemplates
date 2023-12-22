package tatiana_milkina.lesson_18;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        System.out.println(supplierStr.get());
    }
}
