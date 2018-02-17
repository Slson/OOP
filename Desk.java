package oop2hometask1;

import java.util.Scanner;

public class Desk {

    private Shape[] figureShape=new Shape[4];
    private int i;

    public Desk(Shape[] figureShape, int i) {
        this.i = i;
    }

    public Desk() {
    }
    
    
    
    public void includeFigure(Shape figure, int j){
        System.out.println("Are you sure you want to rewright "+j+" Desk? Tipe YES, or NO");
        Scanner sc=new Scanner(System.in);
        String choose = sc.nextLine();
        if (choose.equals("YES")){
             getFigureShape() [j]=figure;
             System.out.println("Desk "+j+" has been rewrited");
        } else {
            System.out.println("Desk "+j+" has not been rewrited");
        }
        
    }
    
    public void dellFigure(int k){
        System.out.println("Are you sure you want to dellete? Tipe YES, or NO");
        Scanner sc=new Scanner(System.in);
        String choose = sc.nextLine();
        if (choose.equals("YES")){
            Circle dellCircle=new Circle();
            Shape dellShape=dellCircle;
            getFigureShape() [k]=dellShape;
        }
   }     
    
    public void toFindAmpty (){
        for (int u = 0; u < 4; u++) {
            if (getFigureShape() [u]==null){
                System.out.println("Desk "+(u+1)+" is empty");
            }
        }
    }
    
    

    @Override
    public String toString() {
        return "Desk{" + "figureShape=" + figureShape + ", i=" + i + '}';
    }

    public Shape [] getFigureShape() {
        return figureShape;
    }

    public void setFigureShape(Shape[] figureShape) {
        this.figureShape = figureShape;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    
    
}

