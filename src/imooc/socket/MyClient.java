package imooc.socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);

            PrintWriter pr = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
            pr.write("hello, 我是客户端");
            pr.flush();

            socket.shutdownOutput();
            socket.close();
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
