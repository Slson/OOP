package oop11hmtsk4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket80 implements Runnable {

    public Socket80() {
    }

    public static void start80() {
        String answer = "<a href=\"127.0.0.1:9001\">Nothing to see at</a>";

        try (ServerSocket soc = new ServerSocket(80)) {
            for (;;) {
                Socket clisoc = soc.accept();
                Client cli = new Client(clisoc, answer);
            }
        }
        catch (IOException e) {
            System.out.println("Error to server Socket Open!!!80");

        }
    }

    @Override
    public void run() {
        start80();
    }

}
