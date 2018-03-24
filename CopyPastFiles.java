package oop6hmtsk4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyPastFiles implements Runnable {

    private File[] fileArray;
    private String linkOut;

    public CopyPastFiles() {
    }

    public CopyPastFiles(File[] fileArray, String linkOut) {
        this.fileArray = fileArray;
        this.linkOut = linkOut;
    }

    @Override
    public void run() {
        File[] fileOut = new File[fileArray.length];
        for (int i = 0; i < fileArray.length; i++) {
            fileOut[i] = new File(linkOut + "\\" + fileArray[i].getName());
            try {
                fileOut[i].createNewFile();
            }
            catch (Exception e) {
            }
            try {
                Files.copy(fileArray[i].toPath(), fileOut[i].toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
