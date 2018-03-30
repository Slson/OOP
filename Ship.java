package oop7hmt1.pkg2;
public class Ship implements Runnable{
    private int numberOfShip;
    private int numberOfBoxes;

    public Ship() {
    }

    public Ship(int numberOfShip) {
        this.numberOfShip = numberOfShip;
    }



    public int getNumberOfShip() {
        return numberOfShip;
    }

    public void setNumberOfShip(int numberOfShip) {
        this.numberOfShip = numberOfShip;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public void setNumberOfBoxes(int numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
            Thread.sleep(500);
            }
            catch (Exception e) {
            }
            System.out.println("Box number "+i+" from ship number "+ getNumberOfShip()+" is dischurging");
        }
    }

    
    @Override
    public String toString() {
        return "Ship{" + "numberOfShip=" + numberOfShip + ", numberOfBoxes=" + numberOfBoxes + '}';
    }
    
    

}
