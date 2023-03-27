package JAVA.week10;

public class work1 {

    public static void main(String[] args) {
        
        Rectangle  Rectangle1 = new Rectangle (4, 40);
        System.out.println("The area of a rectangle with width " + Rectangle1.width + " and height " + Rectangle1.height + " is " + Rectangle1.getArea());
        System.out.println("The perimeter of a rectangle is " + Rectangle1.getPerimeter());
        
        Rectangle  Rectangle2 = new Rectangle (3.5, 35.9);
        System.out.println("The area of a rectangle with width " + Rectangle2.width + " and height " + Rectangle2.height + " is " + Rectangle2.getArea());
        System.out.println("The perimeter of a rectangle is " + Rectangle2.getPerimeter());
    }
}

class Rectangle {
        
    double width = 1;
    double height = 1;
        
    public Rectangle () {
    }
    
    public Rectangle (double Width, double Height) {
        width = Width;
        height = Height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}




