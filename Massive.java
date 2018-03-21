package oop6hmt2;

public class Massive implements Runnable {

    private int[] array;
    private int sum;

    public Massive() {
    }

    public Massive(int[] array) {
        this.array = array;
    }

    public void calculateSum() {
        sum = 0;
        for (int i : array) {
            sum += i;
        }
        setSum(sum);

    }

    @Override
    public void run() {
        calculateSum();
//        System.out.println(Thread.currentThread()+" "+   getSum());
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

}
