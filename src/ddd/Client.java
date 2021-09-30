package ddd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket  socket = new Socket("127.0.0.1", 9000);
        Scanner sc=new Scanner(System.in);
        InputStream inputStream=socket.getInputStream();
        OutputStream outputStream=socket.getOutputStream();
        while (true){
            while (sc.hasNext()){
                String sf=sc.next();
                outputStream.write(sf.getBytes());
            }
        }
    }
}
