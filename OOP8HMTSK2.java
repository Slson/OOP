package oop8hmtsk2;

public class OOP8HMTSK2 {

    public static void main(String[] args) {
        Dog dogOne=new Dog(2, "Belyash");
        Dog dogTwo=new Dog(3, "Rex");
        Child childOne=new Child(2, "Tihomir");
        Conteiner cont = new Conteiner();   
        Class classOne=Child.class;
        Child ch=new Child();
        BlackList blackList = new BlackList();
        blackList.addNewClass(Math.class, blackList);
        cont.addNewClass(dogOne.getClass(), blackList);
        cont.addNewClass(dogTwo.getClass(), blackList);
        cont.addNewClass(childOne.getClass(), blackList);
        cont.addNewClass(new Integer(777).getClass(), blackList);
        cont.addNewClass(new Integer(777).getClass(), blackList);
        cont.addNewClass(Math.class, blackList);
        cont.addNewClass(Math.class, blackList);
        cont.addNewClass(Child.class, blackList);
        System.out.println("_______________________");
        cont.print();
        System.out.println("_______________________");
        blackList.print();

        
    }
}
