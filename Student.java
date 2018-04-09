package oop8hmts1;

import java.io.Serializable;

public class Student implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name=" + name + '}';
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}
