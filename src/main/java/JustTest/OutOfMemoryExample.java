package JustTest;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    Person(String aName) {
        this.name = aName;
    }
}
public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        while(true) {
            Person p = new Person("John");
            list.add(p);
        }
    }
}
