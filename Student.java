package oop3hometask1;

public class Student extends Human {

    private String spetialisation;
    private int course;
    private String academicPerformance;

    public Student(String spetialisation, int course, String academicPerformance, int age, int weight, String hoirColour, boolean sex, String familyname) {
        super(age, weight, hoirColour, sex, familyname);
        this.spetialisation = spetialisation;
        this.course = course;
        this.academicPerformance = academicPerformance;
    }

    public Student(String spetialisation, int course, String academicPerformance) {
        this.spetialisation = spetialisation;
        this.course = course;
        this.academicPerformance = academicPerformance;
    }

    public Student() {
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Spetialisation is " + getSpetialisation() + "\n course number " + getCourse() + " academic performance " + academicPerformance
                           + " Age " + getAge());
    }

    public int academicPerfomanseNubber(Student student) {
        int a = 0;
        if (student.getAcademicPerformance().equals("verry good")) {
            a = 1;
        }
        if (student.getAcademicPerformance().equals("good")) {
            a = 2;
        }
        if (student.getAcademicPerformance().equals("not bad")) {
            a = 3;
        }
        if (student.getAcademicPerformance().equals("bad")) {
            a = 4;
        }
        return a;

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

    public String getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(String academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        String n = "";
//    
//           if(getAcademicPerformance()!=null){
//        n+=getAcademicPerformance()+" ";
//    }
//           if(getSpetialisation()!=null){
//        n+=getSpetialisation()+" ";
//    }
//           n+=getCourse()+ " ";
//                    if(getFamilyname()!=null){
//        n+=getFamilyname()+ " ";
//    } 
//                              if(getHoirColour()!=null){
//        n+=getHoirColour()+ " ";
//    }
//                              n+=getAge()+" ";
//                              n+=getWeight()+" ";
//           
        n=getAcademicPerformance()+" "+ getSpetialisation() + " " + getCourse() + " " + getFamilyname() + " " + getHoirColour() + " " + getAge() + " "
                + getWeight() + " \n";
//    
        return n;
    }

//        public void printToFile(File file) {
//            System.out.println(" Spetialisation is " + getSpetialisation() + "\n course number " + getCourse()+ " academic performance " + academicPerformance+
//                                                                                                            " Age "+getAge());
//    }
}
