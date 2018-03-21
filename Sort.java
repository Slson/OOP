package oop6hmt2;

public class Sort {

    private int[] array;

    public Sort(int[] array) {
        this.array = array;
    }

    public Sort() {
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

    public void sort(int[] array) {
        long start = System.currentTimeMillis();
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
        int [] arr=new int [(array1.length+array2.length)];
        arr=merge(merge(array1, array2), merge(array3, array4));
        for (int i : arr) {
            System.out.print(" "+i);
        }
    }
     public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;
 
        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }
}