package RetraTech;

/**
 * Created by a.shipulin on 26.09.17.
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = new String("What's a wonderful world!");
        String[] res = str.split("'");
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
