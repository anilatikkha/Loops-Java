public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 7;
        int m[] = new int[n * 10];
        m[0] = 1;
        // int p = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(".");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(m[j] + " ");
            }
            System.out.println();
            for (int j = i + 1; j > 0; j--) {
                m[j] = m[j] + m[j - 1];
            }
        }
    }

}
