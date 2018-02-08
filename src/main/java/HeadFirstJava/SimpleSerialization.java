package HeadFirstJava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by a.shipulin on 11.12.17.
 */
public class SimpleSerialization  {
    SimpleClass something;

    public SimpleSerialization(SimpleClass something) {
        this.something = something;
    }

    public static void main(String[] args) {
        SimpleClass sc = new SimpleClass("aaa", new Integer(3));
        SimpleSerialization serialization  = new SimpleSerialization(sc);
        try {
            FileOutputStream fs = new FileOutputStream("c:/NewSerialization.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(sc);
            os.close();
            fs.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
