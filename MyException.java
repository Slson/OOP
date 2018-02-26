package oop3hometask1;

public class MyException extends Exception {

    @Override
    public String getMessage() {
        
        return "the group is full";
    }
}
