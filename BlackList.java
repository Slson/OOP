package oop8hmtsk2;
public class BlackList extends Conteiner{

    public BlackList() {
    }
       @Override
    public boolean checkIfExest(Class clasToCheck) {
        boolean tmp=false;
        for (int i = 0; i < temp; i++) {
            if (getClassArray()[i].equals(clasToCheck)) {
                System.out.println("has not been written. " + clasToCheck.getName() + " this class is in a Black List");
                tmp=true;
            }
        }
        return tmp;
      
    }
}
