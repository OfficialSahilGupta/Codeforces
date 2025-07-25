import java.util.*;
public class LuntikandConcerts{
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long sum = a * 1 + b * 2 + c * 3;

        return (int) (sum % 2);
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}