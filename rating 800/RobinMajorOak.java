import java.util.*;
public class RobinMajorOak{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long L = Math.max(1, n - k + 1);
            long R = n;

            long oddCounts = (R + 1)/2 - (L/2);

            if(oddCounts % 2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}