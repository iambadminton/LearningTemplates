package HeadFirstJava;

import java.io. File;
import java.io.FileReader;

/**
 * Created by a.shipulin on 12.12.17.
 */
public class MyTestFileReader {
    public static void main(String[] args) {
        try {


            File file = new File("c:\\sql_script.sql");
            FileReader reader = new FileReader(file);
            int c;
            while((c = reader.read()) != -1){
                System.out.println((char)c);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
