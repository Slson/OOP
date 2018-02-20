package oop3hometask1;

public class Group {

    private Student[] groupe = new Student[10];

    public Group() {
    }

    public void addStudent(Student studentAdd) {
        for (int i = 0; i < 10; i++) {
            if (groupe[i] == null) {
                groupe[i] = studentAdd;
                break;
            }
        }
    }

    public void addStudentByHand(Student studentAdd, int i) {
        try {
            groupe[i] = studentAdd;

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "it's not a good idea");
        }

    }

    public void dellStudent(Student studentDell) {
        for (int i = 0; i < 10; i++) {
            if (groupe[i] == studentDell) {
                groupe[i] = null;
            }
        }
    }

    public void findStudentByName(String name) {
        for (int i = 0; i < 10; i++) {
            if (groupe[i] != null) {
                if (groupe[i].getFamilyname().equals(name)) {
                    System.out.println("Bellow stubest has number" + i + "information: " + groupe[i]);
                }
            }
        }
    }

    public Student[] getGroupe() {
        return groupe;
    }

    public void setGroupe(Student[] groupe) {
        this.groupe = groupe;
    }

//    public Student[] sortFamilyName() {
//        for (int j = 0; j < groupe.length; j++) {
//            for (int i = j + 1; i < groupe.length; i++) {
//                try {
//                    if (groupe[i].getFamilyname().compareTo(groupe[j].getFamilyname()) < 0) {
//                        Student temp = groupe[j];
//                        groupe[j] = groupe[i];
//                        groupe[i] = temp;
//                    }
//                } catch (Exception e){
//                }
//            }
//        }
//        
//        return groupe;
//    }

    @Override
    public String toString() {
                for (int j = 0; j < groupe.length; j++) {
            for (int i = j + 1; i < groupe.length; i++) {
                try {
                    if (groupe[i].getFamilyname().compareTo(groupe[j].getFamilyname()) < 0) {
                        Student temp = groupe[j];
                        groupe[j] = groupe[i];
                        groupe[i] = temp;
                    }
                } catch (Exception e){
                }
            }
        }
        
        String s="";
        for (int k = 0; k < groupe.length; k++) {
            if (groupe[k]!=null){
                s+=groupe[k].getFamilyname();
                s+="\n";
            }
        }
        return s;
    }




}
