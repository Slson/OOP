package oop2hometask1;

public class Desk {

    private Shape[] figureShape = new Shape[4];
    private int i;

    
    public Desk() {
    }

    public void includeFigure(Shape figure, int j) {
        if (j < 4 && j >= 0) {
            figureShape[j] = figure;
            System.out.println("Desk " + j + " has been rewrited");
        } else {
            System.out.println("there is no such a desk here. You can choose 0,1,2,3");
        }
    }

    public void dellFigure(int k) {
        figureShape[k]=null;
    }

    public void toGetInformation() {
        for (int u = 0; u < 4; u++) {
            if (figureShape[u] == null) {
                System.out.println("Desk " + u  + " is empty");
            } else {
                if (getFigureShape()[u] instanceof Circle) {
                    System.out.println(u + "desk has a circle");
                }
                if (getFigureShape()[u] instanceof Square) {
                    System.out.println(u + "desk has a Square");
                }
                if (getFigureShape()[u] instanceof Triangular) {
                    System.out.println(u + "desk has a Triangular");
                }

                System.out.println("an area of figure in " + u + " desk is " + getFigureShape()[u].getArea());
            }
        }
    }

    public double totalArray() {
        double totalArray = 0;
        for (int p = 0; p < 4; p++) {
            if (figureShape[p] != null) {
                totalArray +=figureShape[p].getArea();
            }
        }
        return totalArray;
    }

    @Override
    public String toString() {
        return "Desk{" + "figureShape=" + figureShape + ", i=" + i + '}';
    }

    public Shape[] getFigureShape() {
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
