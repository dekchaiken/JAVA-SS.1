package JAVA.Week4;

import java.util.Scanner;

public class work2 {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysAf = input.nextInt();
        int futureDay = (today + daysAf) % 7;
        String todayDayString = findDate(today);
        String futureDayString = findDate(futureDay);

        System.out.println("Today is " + todayDayString + " and the future day is " + futureDayString);
    }

    public static String findDate(int date) {

        String today;

        switch (date) {
            case 0:
                today = "Sunday";
                break;
            case 1:
                today = "Monday";
                break;
            case 2:
                today = "Tuesday";
                break;
            case 3:
                today = "Wednesday";
                break;
            case 4:
                today = "Thursday";
                break;
            case 5:
                today = "Friday";
                break;
            case 6:
                today = "Saturday";
                break;
            default:
                today = "Invalid Day";
        }
        return today;
    }
}
