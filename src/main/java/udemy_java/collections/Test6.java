package udemy_java.collections;

import java.util.*;

public class Test6 {
    public static void main(String args[]) throws CloneNotSupportedException {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");
        //Person person2 = person;

        map.put(person, "123");
        map.put(person2, "123");

        set.add(person);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}

class Person implements Cloneable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}