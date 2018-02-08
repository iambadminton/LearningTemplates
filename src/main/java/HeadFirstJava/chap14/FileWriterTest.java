package HeadFirstJava.chap14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by a.shipulin on 13.12.17.
 */
public class FileWriterTest {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\13122017.txt"));
            for (int i = 1; i <= 10; i++) {
                writer.write(Integer.toString(i));
                System.out.println("Записали " +i);


            }
            //writer.close();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
