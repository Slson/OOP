package oop5hometsk1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class OOP5Hometsk1 {

    public static void main(String[] args) {
        MyFileFilter mFF = new MyFileFilter("jpg");
        File folder = new File("F:\\Картинки");
        File[] fileList = folder.listFiles(mFF);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        for (File file : fileList) {
            String s = "C:\\Users\\User\\Documents\\TestDell\\" + file.getName();
            File f = new File(s);
            try {
                f.createNewFile();
            }
            catch (IOException e) {
                System.out.println(e);
            }

            try {
                fis = new FileInputStream(file.getName());
                 fos = new FileOutputStream(s); 
//                Files.copy(file.toPath(), f.toPath(), StandardCopyOption.REPLACE_EXISTING);

                byte[] bufer = new byte[1024];
                int byteread = 0;
                for (; (byteread = fis.read(bufer)) > 0;) {
                    fos.write(bufer, 0, byteread);
                }
            }
            catch (IOException e) {
                System.out.println(e);
            }
            finally {
                try {
                    if (fos!=null){fos.close();}
                    if (fis!=null){fis.close();}
                }
                catch (IOException e) {
                    System.out.println(e);
                }

            }
        }

    }
}
