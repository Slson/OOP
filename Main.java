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

        groupe.findStudentByName("Petya");

        groupe.addStudentByHand(twoStudent, 11);

        System.out.println(groupe.toString());

    }

}
