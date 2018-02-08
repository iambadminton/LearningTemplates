package HeadFirstJava;

/**
 * Created by a.shipulin on 10.11.17.
 */
public class ForTest {
    public static void main(String[] args) {
        int[] a = {1, 5,8,9,9,7,8,5,4,7,98,88,78,99,77,33};
        /*for(int num:a) {
            System.out.println(num);
        }*/
        for( int i= 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
