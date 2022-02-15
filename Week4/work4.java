package JAVA.Week4;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        double x = input.nextDouble();
        System.out.print("Enter Y coordinate: ");
        double y = input.nextDouble();

        if (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10.0) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }

    }
}