package JAVA.Week5;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double area = (6.0 * side * side) / (4.0 * Math.tan(Math.PI / 6.0));
        System.out.println(String.format("The area of the hexagon is %.2f", area));
    }
}
