package metanit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Belgium");
        states.add("Italy");

        Iterator<String> iterator = states.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(iterator.next());

    }
}
