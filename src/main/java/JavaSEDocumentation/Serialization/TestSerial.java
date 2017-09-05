package JavaSEDocumentation.Serialization;

import java.io.*;

/**
 * Created by a.shipulin on 05.09.17.
 */
public class TestSerial implements Serializable {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("====> " + oos.toString());


        TestSerial ts = new TestSerial();
        oos.writeObject(ts);
        oos.flush();
        oos.close();
    }
}
