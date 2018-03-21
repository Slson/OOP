package oop6hmt2;

public class SumCalculating {

    private int[] array;

    public SumCalculating() {
    }

    public SumCalculating(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int[] partArray(int[] fullaray, int part) {
        int[] partArray = new int[fullaray.length / 4];
        if (part == 1) {
            for (int i = 0; i < fullaray.length / 4; i++) {
                partArray[i] = fullaray[i];
            }
        }
        if (part == 2) {
            for (int i = fullaray.length / 4; i < fullaray.length / 2; i++) {
                partArray[i - fullaray.length / 4] = fullaray[i];
            }
        }
        if (part == 3) {
            for (int i = fullaray.length / 2; i < fullaray.length * 3 / 4; i++) {
                partArray[i - fullaray.length / 2] = fullaray[i];
            }
        }
        if (part == 4) {
            for (int i = fullaray.length * 3 / 4; i < fullaray.length; i++) {
                partArray[i - fullaray.length * 3 / 4] = fullaray[i];
            }

        }
        return partArray;
    }

    public void calculateSumBy1Thread(int[] array) {
//        long start = System.currentTimeMillis();
        Massive m = new Massive(array);
        Thread thr = new Thread(m);
        long start = System.currentTimeMillis();
        thr.start();
        try {
            thr.join();
        }
        catch (Exception e) {
        }
        System.out.println("Sum of 1 thread is: " + m.getSum());
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Time by 1 thread is: " + timeConsumedMillis);
    }

    public void calculateSumBy4Threads(int[] array) {
//        long start = System.currentTimeMillis();
        int[] array1 = partArray(array, 1);
        int[] array2 = partArray(array, 2);
        int[] array3 = partArray(array, 3);
        int[] array4 = partArray(array, 4);
        Massive m1 = new Massive(array1);
        Thread thr1 = new Thread(m1);
        Massive m2 = new Massive(array2);
        Thread thr2 = new Thread(m2);
        Massive m3 = new Massive(array3);
        Thread thr3 = new Thread(m3);
        Massive m4 = new Massive(array4);
        Thread thr4 = new Thread(m4);
        long start = System.currentTimeMillis();
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        try {
            thr1.join();
            thr2.join();
            thr3.join();
            thr4.join();
        }
        catch (Exception e) {
        }
        System.out.println("Sum of 4 threads is :" + (m1.getSum() + m2.getSum() + m3.getSum() + m4.getSum()));
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Time of 4 threads: " + timeConsumedMillis);
    }
}
