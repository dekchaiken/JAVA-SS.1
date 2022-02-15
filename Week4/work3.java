package JAVA.Week4;

import java.util.Scanner;

public class work3 {

    public static void main(String[] strings) {

        int bot = (int) (Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2) : ");
        int user = input.nextInt();
        String computer = getplayer(bot);
        String player = getplayer(user);
        String game = getGame(bot, user);
        // System.out.println(bot);
        System.out.println("The computer is " + computer + ". You are " + player + ". " + game);
    }

    public static String getplayer(int hand) {

        String handStr;
        switch (hand) {
            case 0:
                handStr = "scissor";
                break;
            case 1:
                handStr = "rock";
                break;
            case 2:
                handStr = "paper";
                break;
            default:
                handStr = null;
        }
        return handStr;
    }

    public static String getGame(int computer, int player) {
        if (computer == player)
            return "It's a draw!";

        String status = "";
        switch (player) {
            case 0:
                status = (computer != 1) ? "You won!" : "You lost!";
                break;
            case 1:
                status = (computer != 2) ? "You won!" : "You lost!";
                break;
            case 2:
                status = (computer != 0) ? "You won!" : "You lost!";
                break;
        }

        return status;
    }
}
