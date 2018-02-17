package oop2hometask1;

public class Triangular extends Shape{

    private Point a;
    private Point b;
    private Point c;
    
    
    
    public Triangular(Point a, Point b, Point c) {
        
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangular() {
    }
    @Override
       public double getPerimetr () {
      double perimetr = a.length(a, b)+b.length(a, c)+c.length(a, c);
        return perimetr;
    }

@Override
    public double getArea() {
        double p = getPerimetr()/2;
        double area = Math.pow(p*(p-a.length(a,b))*(p-b.length(a, c))*(p-c.length(c, b)), 0.5);
        return area;
    }

    @Override
    public String toString() {
        return "Triangular{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
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

}
