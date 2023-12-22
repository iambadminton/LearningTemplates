package JavaCore;

public class TestThreePointArgument {
    public static void main(String[] args) {

        System.out.println("2 параметра: 1 и 2");
        show(1, 2);
        System.out.println("3 параметра: 10, 20, 30");
        show(10, 20, 30);
        System.out.println("без параметров");
        show();
    }

    private static void show(int... v) {
//        for (int element : v) {
//            System.out.println(element);
//        }
        if(v.length > 0) {
            System.out.println(v[0]);
        }
    }
}
