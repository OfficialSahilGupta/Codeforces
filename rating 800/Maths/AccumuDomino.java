import java.util.*;
public class AccumuDomino{
    static Scanner sc = new Scanner(System.in);
    static long ans(){
        long n = sc.nextInt();
        long m = sc.nextInt();

        if(m == 1) return n - 1;
        else return (n * (m - 1));
    }

    public static void main(String[] a){

        System.out.println(ans());

    }
}