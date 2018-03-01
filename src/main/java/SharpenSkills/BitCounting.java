package SharpenSkills;

/**
 * Created by a.shipulin on 01.03.18.
 */
public class BitCounting {
    public static int countBits(int n){
        // мое решение:
        //return ((String)Integer.toBinaryString(n)).replaceAll("0", "").length();
        // решение других участников
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        BitCounting bitCounting = new BitCounting();
        System.out.println(bitCounting.countBits(1234));
    }
}
