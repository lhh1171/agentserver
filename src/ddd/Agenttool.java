package ddd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Agenttool {
    public static String st(Socket socket) throws IOException {
        InputStream inputStream=socket.getInputStream();
        OutputStream outputStream=socket.getOutputStream();
        StringBuilder s1 = new StringBuilder();
//        int len;
//            while ((len = inputStream.read()) !=0) {
//                s1.append((char)len);
//                System.out.println(len+"--->"+(char)len);
//            }
        byte[] bbuf = new byte[1024];
        int len1 = inputStream.read(bbuf);
        return (new String(bbuf)+"agentxxx");
        }

    public static void tran(Socket so,String str) throws IOException {
        InputStream inputStream=so.getInputStream();
        OutputStream outputStream=so.getOutputStream();
        outputStream.write(str.getBytes());
    }
}
