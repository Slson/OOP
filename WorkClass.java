package oop8hmts1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WorkClass {

    public WorkClass() {
    }
    public static GroupOfStudents dancers;
    public static GroupOfStudents footbolTeam;
    public static GroupOfStudents dancersCopy;
    public static GroupOfStudents footbolersCopy;

    public static void createTwoGroupOfStudents() {
        Student student;
        dancers = new GroupOfStudents("Dancers");
        footbolTeam = new GroupOfStudents("Footbolplayers");
        for (int i = 0; i < 20; i++) {
            student = new Student();
            if (i < 10) {
                dancers.addStudent(student);
                dancers.getStudentArray()[i].setAge(23);
                dancers.getStudentArray()[i].setName("Michael Jackson");
            } else {
                footbolTeam.addStudent(student);
                footbolTeam.getStudentArray()[i - 10].setAge(25);
                footbolTeam.getStudentArray()[i - 10].setName("Cristiano Ronaldo");
            }
        }
    }

    public static void copyBytesToFileAndFromFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
            oos.writeObject(dancers);
        }
        catch (IOException e) {
            System.out.println("ERROR while saving dancers");
            e.printStackTrace();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"))) {
            oos.writeObject(footbolTeam);
        }
        catch (IOException e) {
            System.out.println("ERROR while saving footbolteam");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))) {
            dancersCopy = (GroupOfStudents) ois.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR while loading dancers");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"))) {
            footbolersCopy = (GroupOfStudents) ois.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR while loading footbollers");
        }
    }
}
