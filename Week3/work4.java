package JAVA.Week3;

import java.util.Scanner;

public class work4 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
