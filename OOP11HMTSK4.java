package oop11hmtsk4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class OOP11HMTSK4 {

    public static void main(String[] args) throws IOException {

        String answer = "<a href=\"1\">PRESS1</a><a href=\"2\">PRESS2</a><a href=\"3\">PRESS3</a><a href=\"4\">PRESS4</a><a href=\"5\">PRESS5</a><a href=\"/\">PRESS/</a><a href=\"*\">PRESS*</a><a href=\"-\">PRESS-</a><a href=\"+\">PRESS+</a><a href=\"enter\">PRESS ENTER</a>";
        Calculator calculator = new Calculator();
        try (ServerSocket soc = new ServerSocket(80)) {
            for (;;) {
                Socket clisoc = soc.accept();
                Client cli = new Client(clisoc, answer, calculator);
            }
        }
    }
}