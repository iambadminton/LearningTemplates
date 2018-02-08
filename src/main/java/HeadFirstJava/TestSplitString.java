package HeadFirstJava;

import java.io.Serializable;

/**
 * Created by a.shipulin on 13.12.17.
 */
public class TestSplitString implements Serializable{
    private static long  serialVersionUID = -4587L;

    public static void main(String[] args) {
        String string = "Тяжело быть белой вороной";
        String[] result = string.split(" ");
        for(String res: result) {
            System.out.println(res);
        }

    }
}
