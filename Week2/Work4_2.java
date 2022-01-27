public class Work4_2 {
    public static void main(String[] args) {

        System.out.printf("%3s  |%4s  |%5s\n", "a", "a2", "a3");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%3d  |%4d  |%5d\n", i, i * i, i * i * i);
        }
    }
}
