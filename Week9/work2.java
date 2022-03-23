package JAVA.Week9;

import java.util.Scanner;

public class work2 {

    static final int limit = 10;
    public static void main(String[] args) {

        double[] n = new double[limit];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();
        System.out.println("The minimum number is : " + min(n));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }
}