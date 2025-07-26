import java.util.Scanner;

public class WhosOpposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int diff = Math.abs(a - b);
            int n = 2 * diff;
            if (Math.max(a, b) < 2 * Math.min(a, b)) {
                System.out.println(-1);
                continue;
            }
            if (c > n || c < 1) {
                System.out.println(-1);
                continue;
            }
            int d = (c + diff - 1) % n + 1;
            System.out.println(d);
        }
        scanner.close();
    }
}