package oop6hmt2;

public class Massive implements Runnable {

    private int[] array;
    private int sum;

    public Massive() {
    }

    public Massive(int[] array) {
        this.array = array;
    }

    public void shellSort() {
        int temp;
        int h = 0;
        while (h <= array.length / 3) {
            h = 3 * h + 1;
        }

        for (int k = h; k > 0; k = (k - 1) / 3)
            for (int i = k; i < array.length; i++) {
                temp = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (temp < array[j - k]) {
                        array[j] = array[j - k];
                    } else {
                        break;
                    }
                }
                array[j] = temp;
            }
    }

    @Override
    public void run() {

        shellSort();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void printArray() {
        for (int i : array) {
            System.out.println(i);
        }
    }

}
