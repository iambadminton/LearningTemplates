package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ExecutorService pool = Executors.newFixedThreadPool(200);
        ServerSocket serverSocket = new ServerSocket(45000);
        System.out.println("Server started at port 45000. Listening for client connections...");

        try {
            while (true) {
                final Socket socket = serverSocket.accept();
                //handle(socket);
                new Thread(() -> handle(socket)).start();
            }
        } finally {
            serverSocket.close();
        }


    }

    private static void handle(Socket socket) {
        try {
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String clientRequest = reader.readLine(); // blocking call

            String serverResponse = clientRequest + ", serverTime = " + System.currentTimeMillis();
            PrintWriter printWriter = new PrintWriter(out);

            printWriter.println(serverResponse); // blocking call

            printWriter.flush();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
