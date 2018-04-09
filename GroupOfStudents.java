package oop8hmts1;

import java.io.Serializable;

public class GroupOfStudents implements Serializable {

    private static final long serialVersionUID = 1L;

    private Student[] studentArray;
    private String interests;
    private int count;

    public GroupOfStudents(String interests) {
        studentArray = new Student[10];
        this.interests = interests;
    }

    public GroupOfStudents() {
        studentArray = new Student[10];
    }

    public void addStudent(Student student) {
        if (count < 10) {
            studentArray[count] = student;
            count += 1;
        } else {
            System.out.println(this.interests + " array is full");
        }
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void printStudents() {
        for (Student student : studentArray) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return interests + " group has " + studentArray.length + " students";
    }

}
