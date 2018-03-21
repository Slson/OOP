package oop6hmt2;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
            
        int[] array = new int[80000000];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        
        SumCalculating sc=new SumCalculating();
        sc.calculateSumBy4Threads(array);
        SumCalculating sc1=new SumCalculating();
        sc1.calculateSumBy1Thread(array);
        
        
 
    

}}
