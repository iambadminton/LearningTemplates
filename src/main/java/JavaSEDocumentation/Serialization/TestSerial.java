package JavaSEDocumentation.Serialization;

import java.io.*;

/**
 * Created by a.shipulin on 05.09.17.
 */
public class TestSerial implements Serializable {
    public byte version = 100;
    public byte count = 0;
    private static final long serialVersionUID = 656565L;

    /*public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("====> " + oos.toString());


        TestSerial ts = new TestSerial();
        oos.writeObject(ts);
        oos.flush();
        oos.close();
    }*/

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        TestSerial ts = (TestSerial) oin.readObject();
        System.out.println("version="+ts.version);
    }
}
