import java.util.*;
public class BunLover{
    static Scanner sc = new Scanner(System.in);
    static long ans(){
        long n = sc.nextInt();
        return (n * n) + ((n + 1) * 2);
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}