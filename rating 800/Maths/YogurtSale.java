import java.util.Scanner;
public class YogurtSale{
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cost = (n / 2) * Math.min(2 * a, b) + (n % 2) * a;
        return cost;

    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}