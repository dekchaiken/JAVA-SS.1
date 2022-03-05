package JAVA.Week8;

public class work2 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%3s  |  %4s\n", "Year", "Days in a year");
            System.out.printf("%3s  |       %4s\n", i, numberOfDaysInYear(i));
        }
    }

    public static int numberOfDaysInYear(int year) {
        if (leapyear(year)) 
            return 366;
        else 
            return 365;
    }

    public static boolean leapyear(int year) {
        return  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}