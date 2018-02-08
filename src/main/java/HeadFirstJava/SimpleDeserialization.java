package HeadFirstJava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by a.shipulin on 11.12.17.
 */
public class SimpleDeserialization  {


    public static void main(String[] args) {
        SimpleClass sc;
        try {
            FileInputStream fs = new FileInputStream("C:/NewSerialization.ser");

            ObjectInputStream os = new ObjectInputStream(fs);
            sc = (SimpleClass) os.readObject();
            System.out.println(sc.name + " " + sc.age);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
