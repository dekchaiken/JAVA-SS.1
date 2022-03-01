package JAVA.Week6;

import java.util.Scanner;

public class work3S3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = input.nextLine();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count++;
            }  
        System.out.println("The number of uppercase letters is " + count);
    }
}