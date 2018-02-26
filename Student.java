package oop3hometask1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Student extends Human implements Comparable {

    private String spetialisation;
    private int course;

    public Student(String spetialisation, int course, int age, int weight, String hoirColour, boolean sex, String familyname) {
        super(age, weight, hoirColour, sex, familyname);
        this.spetialisation = spetialisation;
        this.course = course;
    }

    public Student(String spetialisation, int course) {
        this.spetialisation = spetialisation;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Spetialisation is " + spetialisation + "\n course number " + course);
    }

    public String getSpetialisation() {
        return spetialisation;
    }

    public void setSpetialisation(String spetialisation) {
        this.spetialisation = spetialisation;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Familyname " + super.getFamilyname() + ". Spetialisation " + spetialisation + ". Course " + course;
    }

    public Student[] compareMethod(Student[] array, String method) {

        try (PrintWriter a = new PrintWriter("temp.txt")) {
            a.print(method);
        }
        catch (Exception e) {
        }
        Arrays.sort(array);
        return array;
    }

    @Override
    public int compareTo(Object t) {
        Student anotherStudent = (Student) t;
        try {
            File file = new File("temp.txt");
            Scanner scanner = new Scanner(file);
            String sw = scanner.nextLine();
            if (sw.equals("Course")) {
                if (this.getCourse() > anotherStudent.getCourse()) {
                    return 1;
                }
                if (this.getCourse() < anotherStudent.getCourse()) {
                    return -1;
                }
            }
            if (sw.equals("FName") && t != null) {

                if (this.getFamilyname().compareTo(anotherStudent.getFamilyname()) > 0) {
                    return 1;
                }
                if (this.getFamilyname().compareTo(anotherStudent.getFamilyname()) < 0) {
                    return -1;

                }

            }
        }
        catch (Exception e) {
        }
        return 0;
    }

}
