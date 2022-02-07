package JAVA.Week3;

import java.util.Scanner;

public class work2 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance : ");
        double driving = input.nextDouble();
        System.out.print("Enter kilometers per liter : ");
        double kilometers_L = input.nextDouble();
        System.out.print("Enter price per liter : ");
        double price_L = input.nextDouble();
        double cost_of_driving = (driving / kilometers_L) * price_L;

        System.out.printf("The cost of driving is : %.2f", cost_of_driving);
    }
}
