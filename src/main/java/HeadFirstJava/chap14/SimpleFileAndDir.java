package HeadFirstJava.chap14;

import java.io.File;
import java.io.IOException;

/**
 * Created by a.shipulin on 12.12.17.
 */
public class SimpleFileAndDir {
    public static void main(String[] args) {
        try {
            File dir = new File("C:\\12122018");
            dir.mkdir();
            File file = new File("C:\\12122018\\12122018.txt");
            file.createNewFile();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
