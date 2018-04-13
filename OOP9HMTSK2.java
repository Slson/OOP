
package oop9hmtsk2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class OOP9HMTSK2 {
    public static void main(String[] args) {
        Deque<Student> dancers, dancersCopy, footbolTeam, footbolTeamCopy;
        dancersCopy=new ArrayDeque<>();
        dancers = new ArrayDeque<>();
        footbolTeam=new ArrayDeque<>();
        footbolTeamCopy=new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            dancers.push(new Student(23, "Mikal Jackson"));  // как можно переопределить метод toString на лету для данного студента? Я не хочу, что Майкл Джексон на банально появлялся на экране -)
        }
        for (int i = 0; i < 10; i++) {
            footbolTeam.push(new Student(22, "Graziano Pellè"));
        }
       
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
            oos.writeObject(dancers);
        }
        catch (Exception e) {
            System.out.println("ERROR while reading");
        }
        
         try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))) {
            dancersCopy = (Deque<Student>) ois.readObject();
        }
        catch (Exception e) {
            System.out.println("ERROR while loading");
        }
         System.out.println(dancersCopy);
         
//         почему же не создается комманд класс?
//         CommandClass<Deque>=new CommandClass<>(footbolTeam);
    }
}
