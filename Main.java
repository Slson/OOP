package oop6hmt2;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
            
        int[] array = new int[8000];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Sort s1=new Sort();
        s1.sort(array);
        
        
        
        
 
    

}}
