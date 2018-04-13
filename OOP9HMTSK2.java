
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
         CommandClass<Deque<Student>> workingWithFootbolteam = new CommandClass<>(footbolTeam);
         CommandClass<Deque<Student>> workingWithDancers = new CommandClass<>(footbolTeam);
         workingWithFootbolteam.wrightToFile();
         workingWithDancers.wrightToFile();
         
         
         footbolTeamCopy=workingWithFootbolteam.readFromFile();
         dancersCopy=workingWithDancers.readFromFile();
         
         
         System.out.println(dancersCopy+"\n"+footbolTeamCopy);
    }
}
