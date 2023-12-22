package comparator;

import java.util.Arrays;
import java.util.Comparator;

class Product {
    private String name;
    private float price;
    private float quantity;

    public Product(String name, float price, float quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Наименование '" + name + "', цена - "
                + String.valueOf(price)
                + ", количество - "
                + String.valueOf(quantity);
    }
}

class SortedByName implements Comparator<Product> {
    public int compare(Product obj1, Product obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}

class SortedByPrice implements Comparator<Product> {
    public int compare(Product obj1, Product obj2) {
        float price1 = obj1.getPrice();
        float price2 = obj2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class Example1 {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        // заполним объект Product содержимым
        products[0] = new Product("Молоко", 35.56f, 900.00f);
        products[1] = new Product("Кофе", 199.50f, 90.00f);
        products[2] = new Product("Чай", 78.50f, 150.00f);

        // выведем данные без сортировки
        System.out.println("~~~~~ без сортировки");
        for (Product product : products)
            System.out.println(product.toString());

        // Сортировка по цене
        Arrays.sort(products, new SortedByPrice());
        System.out.println("\n~~~ сортировка по цене");

        for (Product product : products)
            System.out.println(product.toString());

        // Сортировка по названию
        Arrays.sort(products, new SortedByName());
        System.out.println("\n~~~ сортировка по названию");

        for (Product product : products)
            System.out.println(product.toString());
    }
}