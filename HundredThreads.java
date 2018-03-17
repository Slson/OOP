package oop6hometask1;

import java.math.BigInteger;

public class HundredThreads implements Runnable {
private int number;

    public HundredThreads(int number) {
        this.number = number;
    }

    public HundredThreads() {
    }
    
    
    public int getNumber() {
        return number;
    }
    
    private BigInteger calculateFactorial(int number){
        BigInteger fact=new BigInteger("1");
        for (int i = 2; i < number; i++) {
            fact=fact.multiply(new BigInteger(""+i));
        }
        return fact;
    }
    public void threadToStart (){
        for (int i = 0; i < 100; i++) {
        Thread thr = new Thread(new HundredThreads(i));
        thr.start();
        }
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.getName()+" "+this.number+"!="+calculateFactorial(this.number));
    }  
}
