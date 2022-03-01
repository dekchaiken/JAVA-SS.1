package JAVA.Week6;

public class work2 {
    
    public static void main(String[] strings) {
        int tails = 0;
        int heads = 0;
        for (int i = 0; i < 1000000; i++) {

            int cast = (int) (Math.random() * 2);
            if (cast == 1) {
                heads++;
            } else
                tails++;
        }
        System.out.println("Heads : " + heads + "\nTails : " + tails);
    }
}