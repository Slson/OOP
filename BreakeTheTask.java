package oop6hmtsk4;

import java.io.File;

public class BreakeTheTask {
   private File [] fileFullArray;
   private String linkOut;

    public BreakeTheTask(File[] fileFullArray, String linkOut) {
        this.fileFullArray = fileFullArray;
        this.linkOut = linkOut;
    }

   
   
   
   public void breakeTheTask (){
         
        File[] fileArray1 = new File[fileFullArray.length / 4];
        File[] fileArray2 = new File[fileFullArray.length / 4];
        File[] fileArray3 = new File[fileFullArray.length / 4];
        File[] fileArray4 = new File[fileFullArray.length - fileArray1.length-fileArray2.length-fileArray3.length];
        for (int i = 0; i < fileFullArray.length / 4; i++) {
            fileArray1[i] = fileFullArray[i];
        }
        for (int i = fileFullArray.length / 4; i < fileFullArray.length / 2-1; i++) {
            fileArray2[i-fileFullArray.length/4] = fileFullArray[i];
        }
        for (int i = fileFullArray.length / 2-1; i < fileFullArray.length * 3 / 4-2; i++) {
            fileArray3[i - (fileFullArray.length / 2-1)] = fileFullArray[i];
        }
        for (int i = fileFullArray.length * 3 / 4-2; i < fileFullArray.length; i++) {
            fileArray4[i -(fileFullArray.length * 3 / 4-2)] = fileFullArray[i];
        }
        toStarThreads(fileArray1);
        toStarThreads(fileArray2);
        toStarThreads(fileArray3);
        toStarThreads(fileArray4);
   }
   
   private void toStarThreads(File []fileArrayToStart){
        CopyPastFiles nc1 = new CopyPastFiles(fileArrayToStart, linkOut);
        Thread tr1 = new Thread(nc1);
        tr1.start();
        try {
            tr1.join();
        }
        catch (Exception e) {
        }
   }
}
