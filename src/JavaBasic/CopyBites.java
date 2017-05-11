package JavaBasic;

import java.io.*;

/**
 * Created by a.shipulin on 02.12.16.
 */
public class CopyBites {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("c:\\xanadu.txt");
            out = new FileWriter("c:\\xanadu_new.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println(c);
            }

        }
        catch (IOException e) {
            System.out.println(e.toString() );
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
        finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }
}
