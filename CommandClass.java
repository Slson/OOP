package oop9hmtsk2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CommandClass<T> {

    private T dq;

    public CommandClass() {
    }

    public CommandClass(T dq) {
        this.dq = dq;
    }

    public void wrightToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
            oos.writeObject(dq);
        }
        catch (Exception e) {
            System.out.println("ERROR while reading");
        }
    }

    public T readFromFile() {
        T qua=null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))) {
            qua = (T) ois.readObject();
        }
        catch (Exception e) {
            System.out.println("ERROR while loading");
        }
        return qua;
    }
}
