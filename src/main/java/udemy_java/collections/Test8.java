package udemy_java.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test8 {
    public static void main(String[] args) {
        PersonTest8 person1 = new PersonTest8(1);
        PersonTest8 person2 = new PersonTest8(2);
        PersonTest8 person3 = new PersonTest8(3);
        PersonTest8 person4 = new PersonTest8(4);

        Queue<PersonTest8> people = new ArrayBlockingQueue<PersonTest8>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));

    }
}

class PersonTest8 {
    private int id;

    public PersonTest8(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonTest8{" +
                "id=" + id +
                '}';
    }
}
