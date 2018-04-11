package oop8hmtsk2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Conteiner {

    private Class[] classArray;
    public int temp;

    public Conteiner() {
        classArray = new Class[100];
    }

    public Class[] getClassArray() {
        return classArray;
    }

    public void addNewClass(Class cl, BlackList blackList) {
        if (!checkIfExest(cl)&&!blackList.checkIfExest(cl)) {
            if (temp == 100) {
                System.out.println("your array is full \n " + cl.getName() + " has not been added");
            } else {
                classArray[temp] = cl;
                temp += 1;
            }
        }
    }
    

    public void dellOneClass() {
        if (temp == 0) {
            System.out.println("your array is ampty");
        } else {
            classArray[temp] = null;
            temp -= 1;
        }
    }
    public Class getAndDellOneClass(){
        Class tmp=classArray[temp-1];
        dellOneClass();
        temp-=1;
        return tmp; 
    }

    public boolean checkIfExest(Class clasToCheck) {
        boolean tmp=false;
        for (int i = 0; i < temp; i++) {
            if (classArray[i].equals(clasToCheck)) {
                System.out.println("has not been written. " + clasToCheck.getName() + " exists allready");
                tmp=true;
            }
        }
        return tmp;
      
    }


    public void print() {
        for (int i = 0; i < temp; i++) {
            System.out.println(classArray[i].getName());
        }

    }
}
