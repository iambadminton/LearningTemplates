package functional.test1;


@FunctionalInterface
interface sayable {
    void say(String str);
}

public class FunctionalInterfaceExample implements sayable{
    @Override
    public void say(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
    }
}
