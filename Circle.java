package oop2hometask1;
public class Circle extends Shape{
   private Point a;
   private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Circle() {
    }
    @Override
    public double getPerimetr (){
        double perimetr=Math.PI*a.length(a, b);
        return perimetr;
    }
    @Override
    public double getArea(){
       double area=Math.PI* Math.pow(a.length(a, b)/2.0,2);
       return area;
    }

    @Override
    public String toString() {
        return "Circle{" + "a=" + a + ", b=" + b + '}';
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


   
   

}
