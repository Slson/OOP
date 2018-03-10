package oop3hometask1;

public interface AncleSam {

    default Student[] returnStudentArray(Group gr) {
        int t = 0;
        int b = 0;
        Student[] array = gr.makeStudentArray();
        for (Student student : array) {
            if (student.getAge() >= 18) {
                t++;
            }
        }
        Student[] arr = new Student[t];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() >= 18) {
                arr[b] = array[i];
                b++;
            }
        }
        return arr;
    }
}
