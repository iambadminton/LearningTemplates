package advanced_capabilities.unsafe_class;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeApp {
    public static void main(String[] args) throws Exception {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);

        // Создание экземпляра класса без конструктора
        // 1. выделяем память
        Person person = (Person)unsafe.allocateInstance(Person.class);

        // Т.к. у нас есть конструктор в классе Person, то мы не можем создать инстанс таким образом:
        //Person person1 = new Person();
        // но мы можем создать инстанс класса без вызова конструктора:
        // если бы вызывался конструктор, то должно быть person.getMoney() = 5, но это не так:
        System.out.println(person.getMoney());
    }
}
