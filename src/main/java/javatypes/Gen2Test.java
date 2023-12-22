package javatypes;

public class Gen2Test {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen(100);
        Gen2<Integer> iOb2 = new Gen2<>(50);

        Gen<String> sOb = new Gen<>("test");
        Gen2<String> sOb2 = new Gen2<>("test2");

        if (iOb instanceof Object) {
            System.out.println("iOb instanceOf Object");
        }

        if (iOb2 instanceof Gen2<?>) {
            System.out.println("iOb2 instanceof Gen2<?>");
        }

        /* wrong:
        if(iOb2 instanceof Gen2<String>) {
            System.out.println("iOb2 instanceof Gen2<String>");
        }
         */

    }

}
