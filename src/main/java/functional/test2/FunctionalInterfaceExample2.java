package functional.test2;


@FunctionalInterface
interface sayable {
    void say(String msg); // abstract method
    // It can contain any number of Object class method
    int hashCode();
    String toString();
    boolean equals(Object obj);
}


public class FunctionalInterfaceExample2 implements sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample2 example2 = new FunctionalInterfaceExample2();
        example2.say("Test");
    }
}
