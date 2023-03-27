package W13;

public class testTriangle {
     
    public static void main(String[] args){
        
        Triangle my = new Triangle(1,1.5,1,"yellow", true);
         
        System.out.println("Area of Triangle " +my.getArea());
         
        System.out.println("Perimeter of triangle " +my.getPerimeter());
          
        System.out.println("color of the Triangle is " +my.getColor());
          
        System.out.println("is triangle filled " +my.isFilled());
    }
}