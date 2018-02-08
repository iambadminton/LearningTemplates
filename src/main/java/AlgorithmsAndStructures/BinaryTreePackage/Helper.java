package AlgorithmsAndStructures.BinaryTreePackage;

/**
 * Created by a.shipulin on 08.02.18.
 */
public class Helper {
    public static String repeat(int amount, String value) {
        return new String(new char[amount]).replace("\0", value);
    }

}
