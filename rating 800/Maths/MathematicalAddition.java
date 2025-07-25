import java.util.*;
public class MathematicalAddition{
    static Scanner sc = new Scanner(System.in);

    static void ans(){
        long u = sc.nextLong();
        long v = sc.nextLong();
    
        
        long x = - u * u;
        long y = v * v;
        System.out.println(x + " " + y);

    }   

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
           ans();
        }
    }
}