package oop3hometask1;

public class Main {

    public static void main(String[] args) {
        Student oneStudent = new Student();
        oneStudent.setAge(22);
        oneStudent.setCourse(4);
        oneStudent.setSpetialisation("Economic");
        oneStudent.setFamilyname("Ylyosha");
        Student twoStudent = new Student("Doctor", 4, 122, 55, "Blondin", false, "Ryba");
        Student threeStudent = new Student("tratorDriver", 2, 19, 80, "Dark", true, "APetya");
        Student fourStudent = new Student("agrarian", 3, 21, 90, "Red", true, "Kotya");

        Group groupe = new Group();
        groupe.addStudent(oneStudent);
        groupe.addStudent(twoStudent);
        groupe.addStudent(threeStudent);
        groupe.addStudent(fourStudent);

        groupe.dellStudent(twoStudent);

        groupe.addStudentByHand(twoStudent, 8);
//        groupe.addStudentInterractivly();
//        groupe.addStudentInterractivly();
//        groupe.setGroupe(twoStudent.compareMethod(groupe.makeStudentArray(), "FName"));
//        System.out.println(groupe);
        Student[]arr=groupe.returnStudentArray(groupe);
        for (Student student : arr) {
            System.out.println(student);
        }
       
    }
}
