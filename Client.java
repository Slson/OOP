package oop11hmtsk4;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable{

    private Socket soc;
    private String ansv;
    private Thread t;
    private Calculator calculator;

    public Client(Socket soc, String ansv, Calculator calculator) {
        super();
        this.soc = soc;
        this.ansv = ansv;
        this.calculator=calculator;
        t = new Thread(this);
        t.start();
       
    }

    public void run() {
        try (InputStream is = soc.getInputStream(); OutputStream os = soc.getOutputStream();
            PrintWriter pw = new PrintWriter(os)) {
            String str="";
            String cod="";
            byte[] rec1 = new byte[is.available()];
            is.read(rec1);
            for (byte b : rec1) {
                str+=(char)b;
            }
            cod=str.substring((str.indexOf("/")+1), (str.indexOf("H")-1));
            if (cod.equals("1")||cod.equals("2")||cod.equals("3")||cod.equals("4")||cod.equals("5")||cod.equals("6")||cod.equals("7")||cod.equals("8")||cod.equals("9")
                    ||cod.equals("0")||cod.equals("*")||cod.equals("/")||cod.equals("+")||cod.equals("-")){
                calculator.constractTheLine(cod.charAt(0));
            }
            if (cod.equals("enter")){
                ansv=String.valueOf(calculator.culculateResult());
                System.out.println(ansv+"from run");
                pw.print(ansv);
            pw.flush();
            
            }
            System.out.println(cod);
            String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n" + "Content-Type: text / html\r\n" + "Content-Length: " + "\r\n" + "Connection: close\r\n\r\n";
            pw.print(response+ansv);
            pw.flush();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}