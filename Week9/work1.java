package JAVA.Week9;

import java.util.Scanner;

public class work1 {

    static int limit = 100;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100 : ");
        int[][] n = new int[2][limit];
        for (int i = 0; i < limit; i++) {
            int num = input.nextInt();
            if (num >= 100 || num <= 0)
            break;
            n[0][i] = num;
            n[1][num] = n[1][num] + 1;
        }

        for (int i = 0; i < n[1].length; i++) {
            if (n[1][i] == 0)
            continue;
            if (n[1][i] > 1) System.out.println(i + " occurs " + n[1][i] + " times.");
            else System.out.println(i + " occurs " + n[1][i] + " time");
        }
    }
}