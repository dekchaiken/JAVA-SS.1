package JAVA.Week6;

public class work1S2 {

    public static void main(String[] args) {

        int count = 1;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                if (count++ % 10 != 0)
                    System.out.print(i  + " ");
                else
                    System.out.print(i +"\n");
            }
        }
    }
}