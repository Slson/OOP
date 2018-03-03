/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3hometask1;

/**
 *
 * @author User
 */
public interface CheckNull {
    public static final int NOT_NULL=10;
    public static  int checkNull(Object a, Object b){
        if (a==null&&b!=null){
            return 1;
        }
        if (a!=null&&b==null){
            return 0;
        }
        return NOT_NULL;
    }
}
