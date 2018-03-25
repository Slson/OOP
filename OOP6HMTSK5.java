package oop6hmtsk5;

import java.io.File;

public class OOP6HMTSK5 {

    public static void main(String[] args) {

        FileChecker flch = new FileChecker("C:\\Users\\User\\Documents\\Dell");
        Thread thr = new Thread(flch);
        thr.start();
    }
}
