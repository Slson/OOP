package oop3hometask1;

import java.io.File;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Student oneStudent = new Student();
        oneStudent.setAge(22);
        oneStudent.setCourse(4);
        oneStudent.setAcademicPerformance("good");
        oneStudent.setSpetialisation("Economic");
        oneStudent.setFamilyname("Ylyosha");
        oneStudent.setHoirColour("Blondin");
        Student twoStudent = new Student("Doctor", 4, "good", 122, 55, "Blondin", false, "Ryba");
        Student threeStudent = new Student("tratorDriver", 2, "exelent", 17, 80, "Dark", true, "APetya");
        Student fourStudent = new Student("agrarian", 3, "bad", 16, 90, "Red", true, "Kotya");
        Student fiveStudent=new Student("engenier", 2, "good", 24, 70, "Blondine", true, "Napoleon");
        Group groupe = new Group();
        groupe.addStudent(oneStudent);
        groupe.addStudent(twoStudent);
        groupe.addStudent(threeStudent);
        groupe.addStudent(fourStudent);
        groupe.addStudent(fiveStudent);

        groupe.dellStudent(twoStudent);

        groupe.addStudentByHand(twoStudent, 8);
        File file=new File("test.txt");
        groupe.printStudentGroupToFile(file);
        Group gr= new Group();
        File fileRead=new File("group.txt");
        gr=gr.makeGroupeFrormFile(fileRead);
        gr.printStudents();

//        System.out.println(gr.numberOfStudent(gr));
//        System.out.println(gr.toString());
        
//        groupe.addStudentInterractivly();
//        Student[]arr=groupe.makeStudentArray();
//        for (Student student : arr) {
//            System.out.println(student);
//        }
//
//        Arrays.sort(arr, (a,b)->CheckNull.checkNull(a, b)!=CheckNull.NOT_NULL
//        ?CheckNull.checkNull(a, b):a.getAge() - b.getAge());
//        System.out.println("_________________________");
//        
//            for (Student student : arr) {
//            System.out.println(student);
//        }
//         Arrays.sort(arr, (a,b)->CheckNull.checkNull(a, b)!=CheckNull.NOT_NULL
//        ?CheckNull.checkNull(a, b):a.getFamilyname().compareTo(b.getFamilyname()));
//        System.out.println("_________________________");
//        
//            for (Student student : arr) {
//            System.out.println(student);
//        }
//            
//        Arrays.sort(arr, (a,b)->CheckNull.checkNull(a, b)!=CheckNull.NOT_NULL
//        ?CheckNull.checkNull(a, b):a.academicPerfomanseNubber(a)- b.academicPerfomanseNubber(b));
//        System.out.println("_________________________");
//        
//            for (Student student : arr) {
//             System.out.println(student);
//        }    
//        System.out.println("\n______________________\nStudents older than 18: \n");
//       Student[]uncleSamArray=groupe.returnStudentArray(groupe);
//        for (Student student : uncleSamArray) {
//            System.out.println(student);
//        }
        
    }
}
