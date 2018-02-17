package oop2hometask1;
    public class Square extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Square() {
    }
    @Override
 public double getPerimetr(){
     double perimetr=getA().length(getA(), getB())*4;
     return perimetr;
 }
 @Override
 public double getArea (){
     double area=Math.pow(getA().length(getA(), getB()),2);
     return area;
 }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Square{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
    }
         


}
