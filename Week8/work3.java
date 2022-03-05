package JAVA.Week8;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String s = input.nextLine();
        System.out.println("Total number of Strings : " + countLetters(s));
    }
    public static int countLetters(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (CharAZ(s.charAt(i))) 
            count++;
        }
        return count;
    }

    public static boolean CharAZ(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
}
