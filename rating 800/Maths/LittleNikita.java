import java.util.*;
public class LittleNikita{
    static Scanner sc = new Scanner(System.in);

    static String ans(){
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n >= m &&  (n - m) % 2 == 0){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] a){
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(ans());
        }
    }
}