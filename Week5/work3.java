package JAVA.Week5;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = input.nextLine();


        String text;
        if (s1.compareTo(s2) > 0) {
            text = s1;
            s1 = s2;
            s2 = text;
        }
        if (s2.compareTo(s3) > 0) {
            text = s2;
            s2 = s3;
            s3 = text;
        }
        if (s1.compareTo(s2) > 0) {
            text = s1;
            s1 = s2;
            s2 = text;
        }

        System.out.println("The three cities in a alphabetical order are " +s1+" "+s2+" "+s3);

    }
}
