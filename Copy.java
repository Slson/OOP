package oop5hometsk1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    private String ext;

    public Copy(String ext) {
        this.ext = ext;
    }

    public Copy() {
    }
    
    
    public File[] getFilesToCopy(String ext) {
        MyFileFilter mFF = new MyFileFilter(ext);
        File folder = new File("F:\\Читать");
        File[] fileList = folder.listFiles(mFF);
        return fileList;
    }

    public void copyFile(File[] fileList) {
        FileInputStream fis;
        FileOutputStream fos;
        for (File file : fileList) {
            try {

                fis = new FileInputStream("F:\\Читать\\" + file.getName());
                fos = new FileOutputStream("C:\\Users\\User\\Documents\\TestDell\\" + file.getName());
                byte[] b = new byte[1024];
                int len;
                while ((len = fis.read(b, 0, 1024)) > 0) {
                    fos.write(b, 0, len);
                }
                fis.close();
                fos.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
