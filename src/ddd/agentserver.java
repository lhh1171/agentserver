package ddd;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class agentserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9000,1000);
        while(true) {
            System.out.println("waiting");
            Socket s = ss.accept();
            System.out.println("收到");
            Socket  socket = new Socket("127.0.0.1", 9001);
            Agenttool.tran(socket,Agenttool.st(s));
        }
    }
}
/*
        ExecutorService pool1;
        pool1 = Executors.newCachedThreadPool();
pool1.submit(new agentserver(s));
    private Socket s=null;
    public agentserver(Socket s){
        this.s=s;
    }
    @Override
    public void run() {
        try {
            System.out.println(Agenttool.st(this.s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/