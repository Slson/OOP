package oop11hmtsk4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket9001 implements Runnable{
       public Socket9001() {
    }

    public static void start9001() {
        String answer1 = "I'll calculate here something";
        try (ServerSocket soc = new ServerSocket(9001)) {
            for (;;) {
                Socket clisoc = soc.accept();
                Client cli2 = new Client(clisoc, answer1);
            }
        }
        catch (IOException e) {
            System.out.println("Error to server Socket Open!!!9001");
        }
    }

    @Override
    public void run() {
        start9001();
    }
}
