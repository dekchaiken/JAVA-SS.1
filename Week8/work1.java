package JAVA.Week8;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int num = input.nextInt();
        System.out.println(reverse(num));
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse =reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}