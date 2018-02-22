package oop3hometask1;

public class Group {

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

    public Student findStudentByName(String name) {
        Student n = new Student();
        for (int i = 0; i < 10; i++) {
            if (groupe[i] != null) {
                if (groupe[i].getFamilyname().equals(name)) {
                    n = groupe[i];
                }
            }
        }
        return n;
    }

    public Student[] getGroupe() {
        return groupe;
    }

    public void setGroupe(Student[] groupe) {
        this.groupe = groupe;
    }

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
                }
                catch (Exception e) {
                }
            }
        }

        String s = "";
        for (int k = 0; k < groupe.length; k++) {
            if (groupe[k] != null) {
                s += groupe[k].getFamilyname();
                s += "\n";
            }
        }
        return s;
    }

}
