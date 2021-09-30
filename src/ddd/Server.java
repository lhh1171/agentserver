package ddd;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9001,1000);
        while(true) {
            System.out.println("waiting");
            Socket s = ss.accept();
            System.out.println("收到");
            System.out.println(Agenttool.st(s));
        }
    }
}
