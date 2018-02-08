package HeadFirstJava.Chap15;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by a.shipulin on 14.12.17.
 */
public class TestServerSocket {
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают Вас полнее", "Два слова: не годится",
            "Будьте честны хотя бы сегодня. Скажите своему начальнику все, что вы *на самом деле* о нем думаете",
            "Возможно, Вам стоит подобрать другую прическу"};

    public void go() {
        try {


            ServerSocket serverSocket = new ServerSocket(4242);

            Socket socket = serverSocket.accept();
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            String advice = getAdvice();
            writer.println(advice);
            writer.close();
            System.out.println(advice);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        TestServerSocket server = new TestServerSocket();
        server.go();
    }
}
