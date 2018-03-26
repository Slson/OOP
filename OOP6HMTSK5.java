package oop6hmtsk5;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OOP6HMTSK5 {

    public static void main(String[] args) {

        FileChecker flch = new FileChecker("C:\\Users\\User\\Documents\\Dell");
        Thread thr = new Thread(flch);
        thr.start();
        String stop=JOptionPane.showInputDialog("Input name");
        if (stop.equals("stop")){
            thr.interrupt();
        }    
    }
}
