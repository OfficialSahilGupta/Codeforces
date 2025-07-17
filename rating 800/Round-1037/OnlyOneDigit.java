import java.util.*;
public class OnlyOneDigit{
    static Scanner sc = new Scanner(System.in);

    static int ans(){
        int x = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        while(x > 0){
            int rem = x % 10;
            if(ans > rem){
                ans = rem;
            }
            x /= 10;
        }

        return ans;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}