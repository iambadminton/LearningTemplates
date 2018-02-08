package RetraTech;

import java.util.StringTokenizer;

/**
 * Created by a.shipulin on 26.09.17.
 */
public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("ab,a;b-t,;;trtr", ";");
        while(tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        /*StringTokenizer st = new StringTokenizer("this is a test", " ,");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }*/

    }
}
