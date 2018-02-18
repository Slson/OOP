package oop2hometask1;

import jdk.nashorn.internal.runtime.JSType;

public class Main {

    public static void main(String[] args) {

        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point d = new Point();
        a.setX(10);
        a.setY(11);
        b.setX(5);
        b.setY(4);
        c.setX(1);
        c.setY(2.5);

        Triangular tr = new Triangular(a, b, c);
        Shape spTriangle = tr;

        Circle cr = new Circle(a, b);
        Shape spCircle = cr;

        Square sq = new Square(a, b, c, d);
        Shape spSquareShape = sq;

        System.out.println("TRIANGL'S AREA IS: " + spTriangle.getArea());
        System.out.println("TRIANGL'S PERIMETS IS: " + spTriangle.getPerimetr());
        System.out.println("Circle's area is: " + spCircle.getArea() + "\n" + "Circle's perimetr is: " + spCircle.getPerimetr());
        System.out.println("Square's area is: " + spSquareShape.getArea() + "\n" + "Square's perimetr is: " + spCircle.getPerimetr());

        Desk desk1 = new Desk();
        desk1.includeFigure(spCircle, 0);

        Desk desk2 = new Desk();
        desk2.includeFigure(spTriangle, 1);

        Desk desk3 = new Desk();
        desk3.includeFigure(spSquareShape, 0);

        desk2.dellFigure(1);

        desk1.toGetInformation();

        if (desk1.getFigureShape()[0] == null) {
            System.out.println("the first desk is ampty");
        } else {
            System.out.println("An area of the figure inside 1st desk is: " + desk1.getFigureShape()[0].getArea());
            System.out.println("A perimetr of the figure inside 1st desk is: " + desk1.getFigureShape()[0].getPerimetr());
        }

        if (desk1.getFigureShape()[1] == null) {
            System.out.println("the second desk is ampty");
        } else {
            System.out.println("An area of the figure inside 1st desk is: " + desk1.getFigureShape()[1].getArea());
            System.out.println("A perimetr of the figure inside 1st desk is: " + desk1.getFigureShape()[1].getPerimetr());
        }
        System.out.println("TOTAL ARRAY IS ALL DESKS IS: " + desk1.totalArray());
    }

}
