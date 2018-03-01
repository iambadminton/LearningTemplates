package SharpenSkills;

/**
 * Created by a.shipulin on 01.03.18.
 */
public class IntegerByteValue {
    public static void main(String[] args) {

        Integer obj = new Integer(10);

        // returns the value of Integer as a byte
        byte b = obj.byteValue();
        System.out.println("Value of b = " + b);
    }
}
