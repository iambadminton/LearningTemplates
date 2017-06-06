package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a.shipulin on 06.06.17.
 */

class Dog {
    String color;

    public Dog(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " dog";
    }

    /*public boolean equals(Object o) {
        return ((Dog) o).color.equals(this.color);
    }

    public int hashCode() {
        return color.length();
    }*/


}

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");

        hashMap.put(d1, 10);
        hashMap.put(d2, 5);
        hashMap.put(d3, 20);
        hashMap.put(d4, 20);

        System.out.println(hashMap.size());

        for (Map.Entry<Dog, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }

    }
}
