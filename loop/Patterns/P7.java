//package loop.Patterns;

public class P7 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
    }
}
