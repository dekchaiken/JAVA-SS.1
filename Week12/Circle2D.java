package JAVA.Week12;

import java.lang.Math;
public class Circle2D {
    private double x;
    private double y;
    private double radius;
    
    Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }
    
    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    double getx()
    {
        return this.x;
    }
    
    double gety()
    {
        return this.y;
    }
    
    double getradius()
    {
        return this.radius;
    }
    
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
    
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
    
    public boolean contains(double x, double y){
        double d= Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
        if (d < radius)
        return true;
        else
        return false;
    }
    
    public boolean contains(Circle2D circle){
        double d= Math.sqrt((this.x-circle.x)*(this.x-circle.x) + (this.y-circle.y)*(this.y-circle.y));
        if (d + this.radius == circle.radius || d + circle.radius == this.radius)
        return true;
        else
        return false;
    }
    
    public boolean overlaps(Circle2D circle){
        double d= Math.sqrt((this.x-circle.x)*(this.x-circle.x) + (this.y-circle.y)*(this.y-circle.y));
        double radiusSum = (this.radius + circle.radius) * (this.radius + circle.radius);
        if (d == radiusSum)
        return true;
        else
        return false;
    }
    
    public static void main(String args[])
    {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}