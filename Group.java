package oop3hometask1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Group implements AncleSam {

    private Student[] groupe = new Student[10];

    public Group() {
    }

    public void addStudent(Student studentAdd) {
        try {
            for (int i = 0; i < 10; i++) {
                if (groupe[i] == null) {
                    groupe[i] = studentAdd;
                    break;
                } else if (i == 9) {
                    throw new MyException();

                }
            }
        }
        catch (MyException e) {
            System.out.println(e);
        }
    }

    public void addStudentInterractivly() {
        Student st = new Student();
        String a = JOptionPane.showInputDialog("Please, enter student's parrameters you want to add:\nHis spetialization:");
        st.setSpetialisation(a);
        int b = Integer.valueOf(JOptionPane.showInputDialog("His age:"));
        st.setAge(b);
        int c = Integer.valueOf(JOptionPane.showInputDialog("His course:"));
        st.setCourse(c);
        String d = JOptionPane.showInputDialog("Please, enter student's FamelyName:");
        st.setFamilyname(d);
        String e = JOptionPane.showInputDialog("Student's academic Perfomanse:");
        st.setAcademicPerformance(e);
        addStudent(st);

    }

    public void addStudentByHand(Student studentAdd, int i) {
        try {
            if (i < 0 || i > groupe.length) {
                for (int j = 0; j < 10; j++) {
                    if (groupe[j] == null) {
                        groupe[j] = studentAdd;
                        break;
                    }
                }
                throw new MyException();
            } else {
                groupe[i] = studentAdd;

            }
        }
        catch (MyException e) {
            System.out.println(e + ". Student was added to group to other free group number");
        }
    }

    public void dellStudent(Student studentDell) {
        for (int i = 0; i < 10; i++) {
            if (groupe[i] == studentDell) {
                groupe[i] = null;
            }
        }
    }

    public void dellStudentByNumber(int i) {
        if (i < 0 || i > groupe.length) {
            groupe[i] = null;
        } else {
            System.out.println("try btw 0 and 9");
        }
    }

    public Student findStudentByName(String name) {
        Student n = new Student();
        int l = 0;
        for (int i = 0; i < 10; i++) {
            if (groupe[i] != null) {
                if (groupe[i].getFamilyname().equals(name)) {
                    n = groupe[i];
                    l++;
                }
            }
        }
        if (l == 1) {
            return n;
        } else {
            return null;
        }
    }

    public Student[] getGroupe() {
        return groupe;
    }

    public void setGroupe(Student[] groupe) {
        this.groupe = groupe;
    }

    public int numberOfStudent(Group gro) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (gro.groupe[i] != null) {
                count++;
            }
        }
        return count;
    }

    public Student[] makeStudentArray() {
        int t = 0;
        int b = 0;
        Student[] arr;
        try {
            for (int i = 0; i < 10; i++) {
                if (groupe[i] != null) {
                    t++;
                }
            }
        }
        catch (Exception e) {
        }
        arr = new Student[t];
        try {
            for (int j = 0; j < 10; j++) {
                if (groupe[j] != null) {
                    arr[b] = groupe[j];
                    b++;
                }
            }
        }
        catch (Exception e) {
        }
        return arr;
    }

    public void printStudentGroupToFile(File file) {
        try (
                PrintWriter printWriter = new PrintWriter(file)) {
            Student[] arrStudent = makeStudentArray();
            for (Student student : arrStudent) {
                printWriter.println(student);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public Group makeGroupeFrormFile(File file) {
        String fromFile = "";
        Group groupeToReturn = new Group();
        String line = "";
        try {
            BufferedReader inOne = new BufferedReader(new FileReader(file));
            try {
                while ((line = inOne.readLine()) != null) {
                    fromFile += line;
                }
            }
            catch (Exception e) {
            }
        }
        catch (FileNotFoundException e) {
        }
        String[] fromFileArray = fromFile.split(" ");
        Student[] studentArr = new Student[fromFileArray.length / 7];

        for (int i = 0; i < studentArr.length; i++) {
            studentArr[i] = new Student();

            studentArr[i].setAcademicPerformance(fromFileArray[i * 7]);
            studentArr[i].setSpetialisation(fromFileArray[i * 7 + 1]);
            studentArr[i].setCourse(Integer.valueOf(fromFileArray[i * 7 + 2]));
            studentArr[i].setFamilyname(fromFileArray[i * 7 + 3]);
            studentArr[i].setHoirColour(fromFileArray[i * 7 + 4]);
            studentArr[i].setAge(Integer.valueOf(fromFileArray[i * 7 + 5]));
            studentArr[i].setWeight(Integer.valueOf(fromFileArray[i * 7 + 6]));
        }

        for (int k = 0; k < studentArr.length; k++) {
            groupeToReturn.addStudent(studentArr[k]);
        }
        return groupeToReturn;
    }

    public void printStudents() {
        try {
            for (Student student : groupe) {
                if (student != null) {
                    System.out.println(student.toString());
                }
            }
        }
        catch (Exception e) {
        }

    }

    @Override
    public String toString() {
        String s = "";
        for (int k = 0; k < 10; k++) {
            try {
                if (groupe[k] != null) {
                    s += groupe[k];
                    s += "\n";
                }
            }
            catch (Exception e) {
            }
        }
        return s;
    }
}
