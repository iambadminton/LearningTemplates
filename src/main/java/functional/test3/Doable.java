package functional.test3;


interface sayable {
    default void say(String msg) {
        System.out.println(msg);
    }
}

@FunctionalInterface
public interface Doable extends sayable{
    void doit();
}
