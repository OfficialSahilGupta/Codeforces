import java.util.Scanner;

public class WhosOpposite {
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int diff = Math.abs(a - b);
        int n = 2 * diff;

        if(Math.max(a, b) < 2 * Math.min(a, b)){
            return -1;
            // continue;
        }

        if(c > n || c < 1){
            return -1;
            // continue;
        }

        int d = (c + diff - 1) % n + 1;
        return d;

    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }

        sc.close();
    }
}