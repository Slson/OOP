package oop2hometask1;


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

        
        
        Desk desk1 = new Desk();
        desk1.includeFigure(cr, 0);

        desk1.includeFigure(spTriangle, 1);

        desk1.includeFigure(spSquareShape, 2);
        
        desk1.dellFigure(1);

        desk1.toGetInformation();
        
        System.out.println("TOTAL ARRAY OF ALL DESKS IS: " +desk1.totalArray());
    }

}
