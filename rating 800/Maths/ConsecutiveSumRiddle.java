import java.util.*;
public class ConsecutiveSumRiddle{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long l, r;

            if(n % 2 == 1){
                // select k == 2;
                l = (n - 1)/2;
                r = l  + 1;
            }

            else{
                // finding the largest divisor of n
                long d = n;
                while(d % 2 == 0){
                    d /= 2;
                }

                if(d == 1){
                    l = 1 - n;
                    r = n;
                }
                else{
                    long k = d;
                    l = (2 * n/ k - k + 1)/ 2;
                    r = l + k - 1;
                }
            }
            System.out.println(l + " " + r);
        }

    }
}