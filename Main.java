package oop3hometask1;

public class Main {

    public static void main(String[] args) {
        Student oneStudent = new Student();
        oneStudent.setAge(22);
        oneStudent.setCourse(2);
        oneStudent.setSpetialisation("Economic");
        oneStudent.setFamilyname("Ylyosha");
        Student twoStudent = new Student("Doctor", 4, 22, 55, "Blondin", false, "Ryba");
        Student threeStudent = new Student("tratorDriver", 2, 19, 80, "Dark", true, "APetya");
        Student fourStudent = new Student("agrarian", 3, 21, 90, "Red", true, "Kotya");

        Group groupe = new Group();
        groupe.addStudent(oneStudent);
        groupe.addStudent(twoStudent);
        groupe.addStudent(threeStudent);
        groupe.addStudent(fourStudent);

        groupe.dellStudent(twoStudent);

        Student findStudent = groupe.findStudentByName("APetya");
        System.out.println(findStudent);
        groupe.addStudentByHand(twoStudent, 8);

        System.out.println(groupe.toString());

    }

}
