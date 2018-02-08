package HeadFirstJava.Chap15;

import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by a.shipulin on 14.12.17.
 */
public class FirstSocket {
    public static void main(String[] args) {
        int i;
        int read;
        byte[] buffer = new byte[1024];
        try {


            Socket socket = new Socket("127.0.0.1", 4242);


            InputStreamReader stream = new InputStreamReader(socket.getInputStream());
            while((read = stream.read()) != -1) {
                String output = new String(buffer, 0, read);
                System.out.println(output);
                System.out.flush();
            }
            socket.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
