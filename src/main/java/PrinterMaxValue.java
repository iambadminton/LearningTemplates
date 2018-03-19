/**
 * Created by a.shipulin on 19.03.18.
 */
public class PrinterMaxValue {
    public static void main(String[] args) {
        int res = 0;
        int i = 0;
        while (res <= Integer.MAX_VALUE) {
            res = (int) Math.pow(2, i);
            i++;
            //System.out.println(" i= " + i + "  res=");
            System.out.println(Math.pow(2, (double)i));
        }
        System.out.println("i=" + i);

        //System.out.println((int)Math.pow(2, 5));
    }
}
