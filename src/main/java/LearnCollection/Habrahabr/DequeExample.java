package LearnCollection.Habrahabr;

import java.util.ArrayDeque;

/**
 * Created by a.shipulin on 03.09.18.
 */
public class DequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();

        System.out.println(states.pop());

        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");




        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.println("print all " + states.size() + " values of deque:");

        while(states.peek() != null) {
            System.out.println(states.pop());
        }

        // ===========
        ArrayDeque<Person> persons = new ArrayDeque<Person>();
        persons.addFirst(new Person("Tom"));
        persons.addLast(new Person("Nick"));
        System.out.println("=====================");
        for (Person p:persons
             ) {
            System.out.println(p.getName());

        }



    }
}
