package JAVA.Week9;

import java.util.Scanner;

public class work3 {

    static int limit = 9999;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter list : ");
        limit = input.nextInt();
        int[] list = new int[limit];
        for (int i = 0; i < limit; i++) {
            list[i] = input.nextInt();
        }
        if (isSorted(list))
        System.out.print("The list is already sorted.\n");
        else 
        System.out.print("The list is not sorted.\n");
    }

    public static boolean isSorted(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
            return false;
        }
        return true;
    }
}