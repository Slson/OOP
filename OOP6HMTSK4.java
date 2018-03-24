package oop6hmtsk4;

import java.io.File;

public class OOP6HMTSK4 {

    public static void main(String[] args) {

        File catalogue = new File("F:\\Картинки");
        File[] fileFullArray = catalogue.listFiles();
        String placeToCopy="C:\\Users\\User\\Documents\\Dell";
        BreakeTheTask btt=new BreakeTheTask(fileFullArray, placeToCopy);
        btt.breakeTheTask();
        System.out.println("WELL DONE");
    }
}
