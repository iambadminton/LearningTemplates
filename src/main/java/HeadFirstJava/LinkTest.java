package HeadFirstJava;

/**
 * Created by a.shipulin on 02.11.17.
 */
public class LinkTest {
    int val;
    public static void main(String[] args) {
       LinkTest a = new LinkTest();
        LinkTest b = new LinkTest();
        a.val = 5;
        b.val = 5;
        a = b;
        if(a == b) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equals");
        }

    

    }
}
