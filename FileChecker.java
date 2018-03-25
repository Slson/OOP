package oop6hmtsk5;

import java.io.File;

public class FileChecker implements Runnable {

    private String directoryToCheckString;
    private int num = 0;
    private int temp = 0;

    public FileChecker(String directoryToCheckString) {
        this.directoryToCheckString = directoryToCheckString;
    }

    @Override
    public void run() {
        File directoryToCheckFile = new File(directoryToCheckString);
        for (;;) {
            File[] fileArray = directoryToCheckFile.listFiles();
            num = fileArray.length;
            if (num > temp) {
                System.out.println((num - temp) + " file(s) was added");
                temp = num;
            }
            if (num < temp) {
                System.out.println((temp - num) + " file(s) was deleted");
                temp = num;
            }
            try {
            Thread.currentThread().wait(1000);    
            }
            catch (Exception e) {
            }
            
        }
    }

}
