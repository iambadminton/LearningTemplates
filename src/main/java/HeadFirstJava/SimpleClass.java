package HeadFirstJava;

import java.io.Serializable;

/**
 * Created by a.shipulin on 11.12.17.
 */
public class SimpleClass implements Serializable {
    String name;
    Integer age;

    public SimpleClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
