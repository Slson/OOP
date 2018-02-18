package oop2hometask1;

import java.util.Scanner;

public class Desk {

    private Shape[] figureShape = new Shape[4];
    private int i;

    public Desk() {
    }

    public void includeFigure(Shape figure, int j) {
        if (j < 4 || j > 0) {
            getFigureShape()[j] = figure;
            System.out.println("Desk " + j + " has been rewrited");
        } else {
            System.out.println("there is no such a desk here. You can choos 0,1,2,3");
        }
    }

    public void dellFigure(int k) {
        getFigureShape()[k] = null;
    }

    public void toGetInformation() {
        for (int u = 0; u < 4; u++) {
            if (getFigureShape()[u] == null) {
                System.out.println("Desk " + (u + 1) + " is empty");
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
        for (int i = 0; i < 4; i++) {
            if (getFigureShape()[i] != null) {
                totalArray += getFigureShape()[i].getArea();
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
