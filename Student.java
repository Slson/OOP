package oop3hometask1;

public class Student extends Human {

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
        return "Familyname "+super.getFamilyname()+ ". Spetialisation " + spetialisation + ". Course " + course;
    }


}
