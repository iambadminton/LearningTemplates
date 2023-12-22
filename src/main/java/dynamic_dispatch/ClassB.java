package dynamic_dispatch;

public class ClassB extends ClassA {
    public String str;


    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.str = "just test";
        System.out.println(b.str);
    }


}
