package HeadFirstJava;

/**
 * Created by a.shipulin on 31.10.17.
 */
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while(x<5) {
            x=x+1;
            y=y+x;
            System.out.println(x+"" +y+" ");
            x = x + 1;
        }
    }
}
