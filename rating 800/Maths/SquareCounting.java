import java.util.*;
public class SquareCounting{
    static Scanner sc = new Scanner(System.in);
    static long ans(){
        long n = sc.nextLong();
        long s = sc.nextLong();
        long k = s / (n * n);
        return k;
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}